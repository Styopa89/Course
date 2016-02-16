package Zashchita2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.NoninvertibleTransformException;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Tanks extends JPanel {

	final boolean COLORDED_MODE = false;
	final int QUADRANT_WIDTH = 15;
	final int QUADRANT_HEIGHT = 13;
	final int SQUARE = 64;
	final int BF_WIDTH = QUADRANT_WIDTH * SQUARE;
	final int BF_HEIGHT = QUADRANT_HEIGHT * SQUARE;

	// 1 - top, 2 - bottom, 3 - left, 4 - right
	int tankDirection = 1;

	int tankX = 256;
	int tankY = 128;

	int bulletX = -100;
	int bulletY = -100;

	int speed = 10;
	int bulletSpeed = 3;

	String[][] battleField = generateBattleField(QUADRANT_HEIGHT,
			QUADRANT_WIDTH);

	void runTheGame() throws Exception {
//		 moveRandom();
		 clean();

	}

	String[][] generateBattleField(int v, int h) {
		Random random = new Random();
		String[][] battleField = new String[v][h];
		String quadrant = getQuadrant(tankX, tankY);
		int x = Integer.valueOf(quadrant.substring(0, quadrant.indexOf("_")));
		int y = Integer.valueOf(quadrant.substring(quadrant.indexOf("_") + 1));
		for (int i = 0; i < v; i++) {
			for (int j = 0; j < h; j++) {
				int k = random.nextInt(2) + 1;
				if (k != 1) {
					battleField[i][j] = "B";
				} else {
					battleField[i][j] = " ";
				}
			}

		}
		battleField[x][y] = " ";
		return battleField;
	}

	void clean() throws Exception {
		for (int i = 0; i < battleField[0].length; i++) {
			moveToQuadrant(1, i + 1);
			for (int j = 0; j < battleField.length; j++) {
				if (battleField[j][i].equals("B")) {
					turn(2);
					fire(2);
				}
			}
		}
	}

	boolean processMove(int direction) {
		String quadrant = getQuadrant(tankX, tankY);
		int y = Integer.valueOf(quadrant.substring(0, quadrant.indexOf("_")));
		int x = Integer.valueOf(quadrant.substring(quadrant.indexOf("_") + 1));
		if (direction == 1) {
			y -= 1;
		} else if (direction == 2) {
			y += 1;
		} else if (direction == 3) {
			x -= 1;
		} else {
			x += 1;
		}
		if (" ".equals(battleField[y][x])) {
			return false;
		} else {
			return true;
		}
	}

	boolean processInterception() {
		String quadrant = getQuadrant(bulletX, bulletY);
		int x = Integer.valueOf(quadrant.substring(0, quadrant.indexOf("_")));
		int y = Integer.valueOf(quadrant.substring(quadrant.indexOf("_") + 1));
		if (" ".equals(battleField[x][y])) {
			return true;
		} else {
			battleField[x][y] = " ";
			bulletX = -100;
			bulletY = -100;
			repaint();
			return false;
		}
	}

	String getQuadrant(int x, int y) {
		return (y / 64) + "_" + (x / 64);
	}
	
	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}

	void fire(int direction) throws Exception {
		direction = tankDirection;
		bulletX = tankX + 25;
		bulletY = tankY + 25;
		int step = 1;
		while (legalMoveFire() && processInterception() ) {
			if (direction == 1 || direction == 2) {
				fireVertical(direction, step);
			} else {
				fireHorizontal(direction, step);
			}
			
			repaint();
			Thread.sleep(bulletSpeed);
		}
	}
	
	void fireVertical(int direction, int step) {
		if (direction == 1) {
			step = -step;
		}
		bulletY += step;
	}
	
	void fireHorizontal(int direction, int step) {
		if (direction == 3) {
			step = -step;
		}
		bulletX += step;
	}
	
	boolean legalMoveFire() {
		if ((bulletX > -14 && bulletX < BF_WIDTH + 14)
				&& (bulletY > -14 && bulletY < BF_HEIGHT + 14)) {
			return true;
		}
		return false;
	}
	

	boolean legalMoveTank(int direction) {
		if ((direction == 1 && tankY == 0)
				|| (direction == 2 && tankY >= (BF_HEIGHT - SQUARE))
				|| (direction == 3 && tankX == 0)
				|| (direction == 4 && tankX >= (BF_WIDTH - SQUARE))) {
			System.out.println("[illegal move] direction: " + direction
					+ " tankX: " + tankX + ", tankY: " + tankY);
			return true;
		}
		return false;
	}

	// move horizontal 3 - left; 4 - right
	void moveHorizontal(int direction, int step) throws Exception {
		if (direction == 3) {
			step = -step;
		}

		for (int i = 0; i < SQUARE; i++) {
			tankX += step;
			repaint();
			Thread.sleep(speed);
		}
	}

	void moveVertical(int direction, int step) throws Exception {
		if (direction == 1) {
			step = -step;
		}
		for (int i = 0; i < SQUARE; i++) {
			tankY += step;
			repaint();
			Thread.sleep(speed);
		}
	}

	void move(int direction) throws Exception {
		int step = 1;
		if (legalMoveTank(direction)) {
			return;
		}
		turn(direction);
		if (processMove(direction) && randomFire(direction)) {
			return;
		}
		if (direction == 3 || direction == 4) {
			moveHorizontal(direction, step);
		} else {
			moveVertical(direction, step);
		}
	}

	boolean randomFire(int direction) throws Exception {
		long time = System.nanoTime();
		time = time % 10;
		if (time % 2 == 0) {
			fire(direction);
			return false;
			
		}
//		System.out.println(direction + "don't fire");
//		Thread.sleep(1000);
		return true;
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

	void moveRandomMe() throws Exception {
		while (true) {
			long time = System.currentTimeMillis();
			String timeStr = String.valueOf(time);
			for (int i = timeStr.length(); i > timeStr.length() - 4; i--) {
				String chStr = String.valueOf(timeStr.charAt(i - 1));
				int ch = Integer.parseInt(chStr);
				if (ch == 5 || ch == 0) {
					continue;
				} else {
					if (ch > 5) {
						ch = 10 - ch;
					}
				}
				move(ch);

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

	// Magic bellow. Do not worry about this now, you will understand everything
	// in this course.
	// Please concentrate on your tasks only.

	public static void main(String[] args) throws Exception {
		Tanks bf = new Tanks();

		bf.runTheGame();
	}

	public Tanks() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH + 14, BF_HEIGHT + 22 + 14));
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
		for (int v = 0; v < QUADRANT_HEIGHT; v++) {
			for (int h = 0; h < QUADRANT_WIDTH; h++) {
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
				g.fillRect(h * SQUARE, v * SQUARE, SQUARE, SQUARE);
			}
		}

		for (int j = 0; j < battleField.length; j++) {
			for (int k = 0; k < battleField[j].length; k++) {
				if (battleField[j][k].equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates
							.substring(0, separator));
					int x = Integer.parseInt(coordinates
							.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, SQUARE, SQUARE);
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
