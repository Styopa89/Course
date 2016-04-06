package refactor.tank;

import refactor.tank.Interface.*;
import refactor.tank.Tanks.AbstractTank;

import java.awt.*;

public class Bullet implements Drawable, Destroyable {
    private int speed = 5;
    private int x;
    private int y;
    private AbstractTank tank;
    private Direction direction;
    private boolean destroyed;

    public Bullet(AbstractTank tank, int x, int y, Direction direction) {
        this.tank = tank;
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.destroyed = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public void updateX(int x) {
        this.x += x;
    }

    public void updateY(int y) {
        this.y += y;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void draw(Graphics g) {
        if (!destroyed) {
            g.setColor(new Color(255, 255, 0));
            g.fillRect(this.x, this.y, 14, 14);
        }
    }

    public AbstractTank getTank() {
        return tank;
    }

    public void destroy() {
       destroyed = false;
    }


}
