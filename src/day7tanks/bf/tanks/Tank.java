package day7tanks.bf.tanks;

import day7tanks.bf.Direction;
import day7tanks.bf.Bullet;
import day7tanks.bf.objbf.BFObject;

public interface Tank extends BFObject {
	
	public Action setUp();

	public void move();

	public Bullet fire();

	public Direction getDirection();
	
	public void updateX(int x);

	public void updateY(int y);
	
	public int getSpeed();
	
	public int getMovePath();

}
