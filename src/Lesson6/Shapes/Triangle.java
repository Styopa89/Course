package Lesson6.Shapes;


import java.awt.*;

public class Triangle extends AbstractShape {

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(255, 0, 0));
        g.fillPolygon(new int[]{0, 0, 50},new int[] {100, 200,200}, 3);
//        g.drawPolyline();

    }
}
