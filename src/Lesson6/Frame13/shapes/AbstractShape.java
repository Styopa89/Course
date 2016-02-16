package Lesson6.Frame13.shapes;


import java.awt.*;

public abstract class AbstractShape implements Drawable {

    protected Color color;

    public AbstractShape() {
        color = Color.cyan;
    }

    public Color getColor() {
        return color;
    }
}

