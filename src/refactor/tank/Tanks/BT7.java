package refactor.tank.Tanks;

import refactor.tank.Direction;

import java.awt.*;

public class BT7 extends AbstractTank {

    public BT7() {
        super();
        speed = super.getSpeed()/2;
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }

    public BT7(int x, int y, Direction direction) {
        super(x, y, direction);
        speed = super.getSpeed() / 2;
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }

    @Override
    void destroy() {

    }
}
