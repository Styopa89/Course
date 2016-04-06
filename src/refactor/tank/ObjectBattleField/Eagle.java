package refactor.tank.ObjectBattleField;


import refactor.tank.Interface.Destroyable;

import java.awt.*;

public class Eagle extends ObjectBattleField implements Destroyable {


    public Eagle(int h, int v) {
        super(h, v);
        color = Color.RED;
    }

    @Override
    public void destroy() {

    }
}
