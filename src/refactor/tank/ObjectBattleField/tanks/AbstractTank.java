package refactor.tank.objectbattlefield.tanks;


import refactor.tank.Bullet;
import refactor.tank.Direction;
import refactor.tank.Interface.*;

import java.awt.*;

public abstract class AbstractTank implements Drawable {
    protected int speed = 5;

    protected Color tankColor;
    protected Color towerColor;
    private int x;
    private int y;
    private Direction direction;

    public AbstractTank() {
        this(128, 512, Direction.UP);
    }


    public AbstractTank(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        System.out.println(x + "   " + y);

    }

//    public Bullet fire() {
//        int bulletX = -100;
//        int bulletY = -100;
//        if (direction == Direction.UP) {
//            bulletX = x + 25;
//            bulletY = y ;
//        } else if (direction == Direction.DOWN) {
//            bulletX = x + 25;
//            bulletY = y - 14;
//        } else if (direction == Direction.LEFT) {
//            bulletX = x + 14;
//            bulletY = y + 25;
//        } else if (direction == Direction.RIGHT) {
//            bulletX = x - 14;
//            bulletY = y + 25;
//        }
//        System.out.println(bulletX + "   " + bulletY);
//        return new Bullet(this, bulletX, bulletY, direction);
//    }



    public void updateX(int i) {
        x +=i;
    }

    public void updateY(int i) {
        y +=i;
    }

    public int getSpeed() {
        return speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(tankColor);
        g.fillRect(this.getX(), this.getY(), 64, 64);

        g.setColor(towerColor);
        if (this.getDirection() == Direction.UP) {
            g.fillRect(this.getX() + 20, this.getY(), 24, 34);
        } else if (this.getDirection() == Direction.DOWN) {
            g.fillRect(this.getX() + 20, this.getY() + 30, 24, 34);
        } else if (this.getDirection() == Direction.LEFT) {
            g.fillRect(this.getX(), this.getY() + 20, 34, 24);
        } else {
            g.fillRect(this.getX() + 30, this.getY() + 20, 34, 24);
        }
    }

    abstract void destroy();
}

