package refactor.tank.bf.tanks;


import refactor.tank.ActionField;
import refactor.tank.Direction;
import refactor.tank.bf.BattleField;

import java.awt.*;

public class Tiger extends AbstractTank {
    private int armor;

    public Tiger(ActionField af, BattleField bf) {
        super(af, bf);
        armor = 1;
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }

    public Tiger(ActionField af, BattleField bf, int x, int y, Direction direction) {
        super(af, bf, x, y, direction);
        armor = 1;
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }
    @Override
    public void destroy() {
        if (armor == 0) {
            super.destroy();
        }
        armor--;
    }
}
