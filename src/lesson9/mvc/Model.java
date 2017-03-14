package lesson9.mvc;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Model {

	// ellipse dimension
	private final Dimension dimention;

	// ellipse position
	private Point position;
	
	// ellipse
	private Shape shape;

	private Random random;
	
	public Model() {
		random = new Random();
		this.dimention = new Dimension(50, 50);
		
		position = new Point(300, 100);
		shape = new Ellipse2D.Float(position.x, position.y, dimention.width, dimention.height);
	}
	
	public void processInterception() {
		int newX = random.nextInt(749) + 1;
		int newY = random.nextInt(549) + 1;
		
		position.x = newX;
		position.y = newY;
		
		shape = new Ellipse2D.Float(position.x, position.y, dimention.width, dimention.height);
	}
	
	public Point getPosition() {
		return position;
	}
 
	public Shape getShape() {
		return shape;
	}

	public Dimension getDimention() {
		return dimention;
	}
}
