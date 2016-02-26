package Lesson6.Shapes;


import java.awt.*;

public class Square extends Rectangle{


    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillPolygon(new int[]{200, 300, 300, 200}, new int[]{200, 200, 300, 300}, 4);
    }
}
