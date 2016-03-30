package refactor.tank.ObjectBattleField;


import refactor.tank.Interface.Drawable;

import java.awt.*;

public abstract class ObjectBattleField implements Drawable {
    private int v;
    private int h;
    protected Color color;

    public ObjectBattleField(int v, int h) {
        this.v = v;
        this.h = h;
    }

    @Override
    public void draw(Graphics g) {
        int x = h * 64;
        int y = v * 64;
        g.setColor(color);
        g.fillRect(x, y, 64, 64);

    }
}
