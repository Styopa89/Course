/*
 * Copyright (c) 2013 midgardabc.com
 */
package Lesson3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * @version 3.0
 */
public class BattleFieldTemplate2 extends JPanel {

	final boolean COLORDED_MODE = false;
	
	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	// 1 - top, 2 - bottom, 3 - left, 4 - right
	int tankDirection = 1;

	int tankX = 128;
	int tankY = 512;
	
	int bulletX = -100;
	int bulletY = -100;
	
	int speed = 10;
	int bulletSpeed = 5;

	String[][] battleField = {
			{"B", "B", "B", "B", "B", "B", "B", "B", "B"},
			{"B", " ", " ", " ", " ", " ", " ", " ", "B"},
			{"B", "B", "B", " ", "B", " ", "B", "B", "B"},
			{"B", "B", "B", " ", " ", " ", "B", "B", "B"},
			{"B", "B", "B", " ", "B", " ", "B", "B", "B"},
			{"B", "B", " ", "B", "B", "B", " ", "B", "B"},
			{"B", "B", " ", " ", " ", " ", " ", "B", "B"},
			{"B", " ", " ", "B", "B", "B", " ", " ", "B"},
			{"B", " ", " ", "B", "B", "B", " ", " ", "B"}
		};

	/**
	 * Write your code here.
	 */
	void runTheGame() throws Exception {
		turn(4);
		while (true) {
		fire();
		}
//		System.out.println(getQuadrant(0, 64));
//		System.out.println(getQuadrant(0, 60));
//		System.out.println(getQuadrant(68, 96));
	}
		
	
	boolean processInterception() {
		String quadrant = getQuadrant(bulletX, bulletY);
		int y = Integer.valueOf(quadrant.substring(0, quadrant.indexOf('_')));
		int x = Integer.valueOf(quadrant.substring(quadrant.indexOf('_') + 1));
		if ("B".equals(battleField[y][x])) {
					battleField[y][x] = " ";
					return true;
				}
		return false;
	}
	
	String getQuadrant(int x, int y) {
		return ((y / 64) + "_" + (x / 64));
	}
	
	void fire() throws Exception {
		int direction = tankDirection;
		bulletX = tankX + 25;
		bulletY = tankY + 25;
		int step = 1;
		while ((bulletX > -14 && bulletX < 590) && (bulletY > -14 && bulletY < 590)) {
			if (direction == 1) {
				bulletY -= step;
//				System.out.println("[Fire up] direction: " + direction + " bulletX: " + tankX + ", bulletY: " + bulletY);
			} else if (direction == 2) {
				bulletY += step;
//				System.out.println("[Fire down] direction: " + direction + " bulletX: " + tankX + ", bulletY: " + bulletY);
			} else if (direction == 3) {
				bulletX -= step;
//				System.out.println("[Fire left] direction: " + direction + " bulletX: " + tankX + ", bulletY: " + bulletY);
			} else {
				bulletX += step;
//				System.out.println("[Fire right] direction: " + direction + " bulletX: " + tankX + ", bulletY: " + bulletY);
			}
			
			repaint();
			Thread.sleep(bulletSpeed);
			if (processInterception()){
				bulletX = -100;
				bulletY = -100;
			}
		}
	}


	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	void move(int direction) throws Exception {
		int step = 1;
		int covered = 0;

		// check limits x: 0, 513; y: 0, 513
		if ((direction == 1 && tankY == 0) || (direction == 2 && tankY >= 512)
				|| (direction == 3 && tankX == 0) || (direction == 4 && tankX >= 512)) {
			System.out.println("[illegal move] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			return;
		}
		
		turn(direction);

		while (covered < 64) {
			if (direction == 1) {
				tankY -= step;
				System.out.println("[move up] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			} else if (direction == 2) {
				tankY += step;
				System.out.println("[move down] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			} else if (direction == 3) {
				tankX -= step;
				System.out.println("[move left] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			} else {
				tankX += step;
				System.out.println("[move right] direction: " + direction + " tankX: " + tankX + ", tankY: " + tankY);
			}
			covered += step;

			repaint();
			Thread.sleep(speed);
		}
	}
	
	void turn(int direction) {
		if (tankDirection != direction) {
			tankDirection = direction;
		}
	}
	
	void moveRandom() throws Exception { 
		Random r = new Random();
		int i;
		while (true) {
			i = r.nextInt(5);
			if (i > 0) {
				move(i);
			}
		}
	}
	
	void moveToQuadrant(int v, int h) throws Exception {
		String coordinates = getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y = Integer.parseInt(coordinates.substring(0, separator));
		int x = Integer.parseInt(coordinates.substring(separator + 1));

		if (tankX < x) {
			while (tankX != x) {
				move(4);
			}
		} else {
			while (tankX != x) {
				move(3);
			}
		}

		if (tankY < y) {
			while (tankY != y) {
				move(2);
			}
		} else {
			while (tankY != y) {
				move(1);
			}
		}
	}

	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.
	
	
	public static void main(String[] args) throws Exception {
		BattleFieldTemplate2 bf = new BattleFieldTemplate2();
		bf.runTheGame();
	}

	public BattleFieldTemplate2() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH + 15, BF_HEIGHT + 22 + 15));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		for (int j = 0; j < battleField.length; j++) {
			for (int k = 0; k < battleField.length; k++) {
				if (battleField[j][k].equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates.substring(0, separator));
					int x = Integer.parseInt(coordinates.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
		
		g.setColor(new Color(0, 255, 0));
		if (tankDirection == 1) {
			g.fillRect(tankX + 20, tankY, 24, 34);
		} else if (tankDirection == 2) {
			g.fillRect(tankX + 20, tankY + 30, 24, 34);
		} else if (tankDirection == 3) {
			g.fillRect(tankX, tankY + 20, 34, 24);
		} else {
			g.fillRect(tankX + 30, tankY + 20, 34, 24);
		}
		
		g.setColor(new Color(255, 255, 0));
		g.fillRect(bulletX, bulletY, 14, 14);
	}

}