package day7tanks.bf.tanks;

import java.awt.Color;
import java.awt.Graphics;
import day7tanks.Direction;
import day7tanks.bf.BattleField;

public abstract class AbstractTank implements Tank {
	
	private int speed = 10;
	protected int movePath = 1;

	// 1 - up, 2 - down, 3 - left, 4 - right
	private Direction direction;

	// current position on BF
	private int x;
	private int y;
	
	private boolean destroyed;
	
	protected BattleField bf;
	protected Color tankColor;
	protected Color towerColor;
	
	public AbstractTank(BattleField bf) {
		this(bf, 128, 512, Direction.UP);
	}
	
	public AbstractTank(BattleField bf, int x, int y, Direction direction) {
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.destroyed = false;
	}

	public void turn(Direction direction) {
		this.direction = direction;
	}

	public void move() {
	}
	
	public Bullet fire() {
		int bulletX = -100;
		int bulletY = -100;
		if (direction == Direction.UP) {
			bulletX = x + 25;
			bulletY = y - 64;
		} else if (direction == Direction.DOWN) {
			bulletX = x + 25;
			bulletY = y + 64;
		} else if (direction == Direction.LEFT) {
			bulletX = x - 64;
			bulletY = y + 25;
		} else if (direction == Direction.RIGHT) {
			bulletX = x + 64;
			bulletY = y + 25;
		}
		return new Bullet(bulletX, bulletY, direction);
	}
	
	public void draw(Graphics g) {
		if (!destroyed) {
			g.setColor(tankColor);
			g.fillRect(this.getX(), this.getY(), 64, 64);
	
			g.setColor(towerColor);
			if (this.getDirection() == Direction.UP) {
				g.fillRect(this.getX() + 20, this.getY(), 24, 34);
			} else if (this.getDirection() == Direction.DOWN) {
				g.fillRect(this.getX() + 20, this.getY() + 30, 24, 34);
			} else if (this.getDirection() == Direction.LEFT) {
				g.fillRect(this.getX(), this.getY() + 20, 34, 24);
			} else {
				g.fillRect(this.getX() + 30, this.getY() + 20, 34, 24);
			}
		}
	}
	
	@Override
	public boolean isDestroyed() {
		return destroyed;
	}

	public void destroy() {
		destroyed = true;
	}
	
	public void moveToQuadrant(int v, int h) throws Exception {

	}
	
	public void moveRandom() throws Exception { 
	}

	public void clean() throws Exception {
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	@Override
	public int getMovePath() {
		return movePath;
	}
}