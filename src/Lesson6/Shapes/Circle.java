package Lesson6.Shapes;

import java.awt.*;

public class Circle extends AbstractShape {


    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(255, 0, 0));
        g.fillOval(100,100,100,100);
        g.setColor(new Color(0, 255, 0));
        g.fillOval(300, 100, 100, 100);
    }
}
