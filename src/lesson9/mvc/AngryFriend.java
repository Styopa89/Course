package lesson9.mvc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AngryFriend extends JPanel {
	
	private Point position;
	private Shape shape;
	private Rectangle mouse;
	private final Dimension dimention;
	private Random random;
	
	public AngryFriend() {
		dimention = new Dimension(50, 50);
		random = new Random();
		init();
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		g2d.setPaint(new Color(86, 142, 204));
		g2d.fillRect(0, 0, getWidth(), getHeight());
		
		if (g2d.hit(mouse, shape, false)) {
			int newX = random.nextInt(749 + 1);
			int newY = random.nextInt(549 + 1);
			
			position.x = newX;
			position.y = newY;
			
			shape = new Ellipse2D.Float(position.x, position.y, dimention.width, dimention.height);
		}

		g2d.setPaint(new Color(203, 30, 0));
		g2d.fillOval(position.x, position.y, dimention.width, dimention.height);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("Catch the ball.");
		f.setMinimumSize(new Dimension(800, 600));
		f.setLocation(300, 100);

		AngryFriend af = new AngryFriend();
		f.getContentPane().add(af);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
	
	private void init() {
		position = new Point(300, 100);
		shape = new Ellipse2D.Float(position.x, position.y, dimention.width, dimention.height);
		mouse = new Rectangle(new Point(0, 0), new Dimension(10, 10));
		
		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				mouse.x = e.getX();
				mouse.y = e.getY();
				repaint();
			}
		});
	}
}
