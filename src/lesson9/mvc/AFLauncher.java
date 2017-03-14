package lesson9.mvc;

import java.awt.Dimension;
import javax.swing.JFrame;

public class AFLauncher {

	public static void main(String[] args) {
		JFrame f = new JFrame("Catch the ball, MVC implementation. ");
		f.setMinimumSize(new Dimension(800, 600));
		f.setLocation(300, 100);

		Model model = new Model();

		View view = new View(model);
		f.getContentPane().add(view);

		Controller controller = new Controller(model, view);
		view.addMouseMotionListener(controller);
		view.setInterceptionListener( controller);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
}
