package refactor.tank.Tanks;


import refactor.tank.Direction;

import java.awt.*;

public class Tiger extends AbstractTank {
    private int armor;

    public Tiger() {
        super();
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }



    public Tiger( int x, int y, Direction direction) {
        super(x, y, direction);
        armor = 1;
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }

    @Override
    public void destroy() {
        if (armor == 0) {
//            super.destroy();
        }
        armor--;
    }
}
