package day7tanks.bf.tanks;

import java.awt.Color;
import java.awt.Graphics;

import day7tanks.Direction;
import day7tanks.bf.Destroyable;
import day7tanks.bf.Drawable;

public class Bullet implements Drawable, Destroyable {

	private int speed = 5;
	
	private int x;
	private int y;
	private Direction direction;

	private boolean destroyed;

	public Bullet(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.destroyed = false;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}
	
	@Override
	public void draw(Graphics g) {
		if (!destroyed) {
			g.setColor(new Color(255, 255, 0));
			g.fillRect(this.x, this.y, 14, 14);
		}
	}
	
	public void destroy() {
		destroyed = true;
	}
	
	@Override
	public boolean isDestroyed() {
		return destroyed;
	}

	public int getSpeed() {
		return speed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Direction getDirection() {
		return direction;
	}
}
