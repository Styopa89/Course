package refactor.tank.ObjectBattleField;


import refactor.tank.Bullet;
import refactor.tank.Interface.Drawable;

import java.awt.*;

public abstract class ObjectBattleField implements Drawable {
    private int vertical;
    private int horizontal;
    protected Color color;

    public ObjectBattleField(int vertical, int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    @Override
    public void draw(Graphics g) {
        int x = horizontal * 64;
        int y = vertical * 64;
        g.setColor(color);
        g.fillRect(x, y, 64, 64);
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public boolean bulletDestroyObjectBF(Bullet b) {
        return false;
    }




}
