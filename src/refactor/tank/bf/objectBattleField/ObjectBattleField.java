package refactor.tank.bf.objectBattleField;


import refactor.tank.bf.Drawable;

import java.awt.*;

public abstract class ObjectBattleField implements Drawable{
    private int v;
    private int h;
    protected Color color;

    public ObjectBattleField(int v, int h) {
        this.v = v;
        this.h = h;
    }

    @Override
    public void draw(Graphics g) {
        int x = v*64;
        int y = h*64;
        g.setColor(color);
        g.fillRect(x, y, 64, 64);

    }
}
