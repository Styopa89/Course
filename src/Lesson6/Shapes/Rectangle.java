package Lesson6.Shapes;


import java.awt.*;

public class Rectangle extends AbstractShape {

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(255, 0, 0));
        g.drawRect(10, 0, 50, 100);
        g.setColor(new Color(0, 0, 255));
        g.fillRect(100, 0 , 50, 100);
    }
}
