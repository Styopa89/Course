package day7tanks.bf.objbf;

import day7tanks.bf.BattleField;
import day7tanks.bf.objbf.BFObject;

import java.awt.Color;
import java.awt.Graphics;


public abstract class SimpleBFObject implements BFObject {

	private int x;
	private int y;


	
	protected Color color;

	private boolean isDestroyed = false;

	public SimpleBFObject(int vertical, int horizontal) {
		this.x = horizontal * 64;
		this.y = vertical * 64;
	}
	
	@Override
	public void destroy() {
		isDestroyed = true;
	}
	
	@Override
	public void draw(Graphics g) {
		if (!isDestroyed) {
			g.setColor(this.color);
			g.fillRect(this.getX(), this.getY(), BattleField.QUADRANT_PX, BattleField.QUADRANT_PX);
		}
	}
	
	public boolean isDestroyed() {
		return isDestroyed;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getHorizontal() {
		return getX() / BattleField.QUADRANT_PX;
	}

	public int getVertical() {
		return getY() / BattleField.QUADRANT_PX;
	}

}
