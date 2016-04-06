package day7tanks;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import day7tanks.bf.Direction;
import day7tanks.bf.objbf.BFObject;
import day7tanks.bf.BattleField;
import day7tanks.bf.objbf.Emply;
import day7tanks.bf.tanks.Action;
import day7tanks.bf.tanks.BT7;
import day7tanks.bf.Bullet;
import day7tanks.bf.tanks.T34;
import day7tanks.bf.tanks.Tank;

public class ActionField extends JPanel {

	private boolean COLORDED_MODE = false;

	private BattleField battleField;
	private Tank defender;
	private Tank aggressor;
	private Bullet bullet;

	void runTheGame() throws Exception {
		while (true) {
			if (!aggressor.isDestroyed() && !defender.isDestroyed()) {
				processAction(aggressor.setUp(), aggressor);
			}
			if (!aggressor.isDestroyed() && !defender.isDestroyed()) {
				processAction(defender.setUp(), defender);
			}
		}
	}
	
	private void processAction(Action a, Tank t) throws Exception {
		if (a == Action.MOVE) {
			processMove(t);
		} else if (a == Action.FIRE) {
			processTurn(t);
			processFire(t.fire());
		}
	}

	private void processTurn(Tank tank) throws Exception {
		repaint();
	}

	private void processMove(Tank tank) throws Exception {
		processTurn(tank);
		Direction direction = tank.getDirection();
		int step = 1;
		
		for (int i = 0; i < tank.getMovePath(); i++) {
			int covered = 0;

			String tankQuadrant = getQuadrant(tank.getX(), tank.getY());
			int v = Integer.parseInt(tankQuadrant.split("_")[0]);
			int h = Integer.parseInt(tankQuadrant.split("_")[1]);

			// check limits x: 0, 513; y: 0, 513
			if ((direction == Direction.UP && tank.getY() == 0) || (direction == Direction.DOWN && tank.getY() >= 512)
					|| (direction == Direction.LEFT && tank.getX() == 0) || (direction == Direction.RIGHT && tank.getX() >= 512)) {
				System.out.println("[illegal move] direction: " + direction
						+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
				return;
			}
			
			// check next quadrant before move
			if (direction == Direction.UP) {
				v++;
			} else if (direction == Direction.DOWN) {
				v--;
			} else if (direction == Direction.RIGHT) {
				h++;
			} else if (direction == Direction.LEFT) {
				h--;
			}
			BFObject bfobject = battleField.scanQuadrant(v, h);
			if (!(bfobject instanceof Emply) && !bfobject.isDestroyed()) {
				System.out.println("[illegal move] direction: " + direction
						+ " tankX: " + tank.getX() + ", tankY: " + tank.getY());
				return;
			}
	

			// process move
	
			while (covered < BattleField.QUADRANT_PX) {
				if (direction == Direction.UP) {
					tank.updateY(-step);
				} else if (direction == Direction.DOWN) {
					tank.updateY(step);
				} else if (direction == Direction.LEFT) {
					tank.updateX(-step);
				} else {
					tank.updateX(step);
				}
				covered += step;
	
				repaint();
				Thread.sleep(tank.getSpeed());
			}
		}
	}

	private void processFire(Bullet bullet) throws Exception {
		this.bullet = bullet;
		int step = 1;
		while ((bullet.getX() > -14 && bullet.getX() < 590)
				&& (bullet.getY() > -14 && bullet.getY() < 590)) {
			if (bullet.getDirection() == Direction.UP) {
				bullet.updateY(-step);
			} else if (bullet.getDirection() == Direction.DOWN) {
				bullet.updateY(step);
			} else if (bullet.getDirection() == Direction.LEFT) {
				bullet.updateX(-step);
			} else {
				bullet.updateX(step);
			}
			if (processInterception()) {
				bullet.destroy();
			}
			repaint();
			Thread.sleep(bullet.getSpeed());
			if (bullet.isDestroyed()) {
				break;
			}
		}
	}

	private boolean processInterception() {
		String coordinates = getQuadrant(bullet.getX(), bullet.getY());
		int y = Integer.parseInt(coordinates.split("_")[0]);
		int x = Integer.parseInt(coordinates.split("_")[1]);

		if (y >= 0 && y < 9 && x >= 0 && x < 9) {
			BFObject bfObject = battleField.scanQuadrant(y, x);
			if (!bfObject.isDestroyed() && !(bfObject instanceof Emply)) {
				battleField.destroyObject(y, x);
				return true;
			}
			
			// check aggressor
			if (!aggressor.isDestroyed() && checkInterception(getQuadrant(aggressor.getX(), aggressor.getY()), coordinates)) {
				aggressor.destroy();
				return true;
			}

			// check aggressor
			if (!defender.isDestroyed() && checkInterception(getQuadrant(defender.getX(), defender.getY()), coordinates)) {
				defender.destroy();
				return true;
			}
		}
		return false;
	}
	
	private boolean checkInterception(String object, String quadrant) {
		int oy = Integer.parseInt(object.split("_")[0]);
		int ox = Integer.parseInt(object.split("_")[1]);

		int qy = Integer.parseInt(quadrant.split("_")[0]);
		int qx = Integer.parseInt(quadrant.split("_")[1]);

		if (oy >= 0 && oy < 9 && ox >= 0 && ox < 9) {
			if (oy == qy && ox == qx) {
				return true;
			}
		}
		return false;
	}

	public String getQuadrant(int x, int y) {
		// input data should be correct
		return y / 64 + "_" + x / 64;
	}

	public ActionField() throws Exception {
		battleField = new BattleField();
		defender = new T34(battleField);
		aggressor = new BT7(battleField, 128, 128, Direction.RIGHT);
//		battleField.addTank(defender);
//		battleField.addTank(aggressor);

		bullet = new Bullet(-100, -100, Direction.NONE);

		JFrame frame = new JFrame("BATTLE FIELD - CLASS");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(battleField.getBfWidth() + 14, battleField.getBfHeight() + 14 + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		battleField.draw(g);
		defender.draw(g);
		aggressor.draw(g);
		bullet.draw(g);
	}
}