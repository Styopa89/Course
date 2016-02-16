package Tank;

import java.awt.*;

public class BT7 extends AbstractTank {
    public BT7(ActionField af, BattleField bf) {
        super(af, bf);
        speed = super.getSpeed()/2;
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }

    public BT7(ActionField af, BattleField bf, int x, int y, Direction direction) {
        super(af, bf, x, y, direction);
        speed = super.getSpeed() / 2;
        tankColor = new Color(0,255,0);
        towerColor = new Color(255,0,0);
    }
}
