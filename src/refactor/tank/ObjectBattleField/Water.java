package refactor.tank.ObjectBattleField;


import refactor.tank.Interface.*;



import java.awt.*;

public class Water extends ObjectBattleField implements Drawable {


    public Water(int v, int h) {
        super(v, h);
        color = Color.BLUE;
    }


}
