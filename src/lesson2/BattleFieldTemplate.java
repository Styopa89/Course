package lesson2;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate extends JPanel {

	boolean COLORDED_MODE = true;
	
	int tankX = 0;
	int tankY = 0;
	
	long speed = 255;
	
	/**
	 * Write your code here.
	 */
	void runTheGame() throws Exception {
		moveToQuadrant("b", "6");
		Thread.sleep(2000);
		moveToQuadrant("c", "3");
		Thread.sleep(2000);
		moveToQuadrant("i", "8");
		
	}
	
		void moveToQuadrant(String v, String h) throws Exception {
			String coordinateXY = getQuadrant(v, h);
			String x = coordinateXY.substring(0, coordinateXY.indexOf("_"));
			String y = coordinateXY.substring(coordinateXY.indexOf("_") + 1);
			while (tankX != Integer.parseInt(x)) {
				if (tankX > Integer.parseInt(x)) {
					move(3);
				} else {
					move(4);
				}
			}
			while (tankY != Integer.parseInt(y)) {
				if (tankY > Integer.parseInt(y)) {
					move(1);
				} else {
					move(2);
				}
			}
			
		}
		
		static String getQuadrant(String v, String h) {
			String y = "abcdefghi";
			String x = "123456789";
			return x.indexOf(h)*64 + "_" + y.indexOf(v)*64;
			
		}
	// 1 - up, 2 - down, 3 - left, 4- right
	void move(int direction) throws Exception {
		int step = 64;
		if (direction == 1){
			if ((tankY - step) >= 0) {
				tankY -= step;
				System.out.println("move up");
			} else System.out.println("don't move");
		}
		if (direction == 2){
			if ((tankY + step) <= 512) {
				tankY += step;
				System.out.println("move down");
			} else System.out.println("don't move");
		}
		if (direction == 3){
			if ((tankX - step) >= 0) {
				tankX -= step;
				System.out.println("move left");
			} else System.out.println("don't move");
		}
		if (direction == 4){
			if ((tankX + step) <= 512) {
				tankX += step;
				System.out.println("move right");
			} else {
				System.out.println("don't move");
			}
		}
		if (direction > 4 || direction < 1){
			System.out.println("don't move");		
		}
		
		repaint();
		Thread.sleep(speed);
	}
	
	void moveRandomMe()	throws Exception {
		while (true) {
		long time = System.currentTimeMillis();
		String timeStr = String.valueOf(time);
		for (int i = timeStr.length(); i > timeStr.length() - 4; i--  ) {
			String chStr = String.valueOf(timeStr.charAt(i-1));
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
	

	
	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	public static void main(String[] args) throws Exception {
		BattleFieldTemplate bf = new BattleFieldTemplate();
		bf.runTheGame();
	}

	public BattleFieldTemplate() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, LESSONS 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
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
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
	}

}