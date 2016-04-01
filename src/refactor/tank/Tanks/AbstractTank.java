package refactor.tank.Tanks;


import refactor.tank.ActionField;
import refactor.tank.BattleField;
import refactor.tank.Bullet;
import refactor.tank.Direction;
import refactor.tank.Interface.*;

import java.awt.*;

public abstract class AbstractTank implements Drawable, Destroyable {
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

    }


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


}

