package refactor.tank.bf.tanks;

import refactor.tank.ActionField;
import refactor.tank.bf.BattleField;
import refactor.tank.Bullet;
import refactor.tank.Direction;
import refactor.tank.bf.Destroyable;
import refactor.tank.bf.Drawable;

import java.awt.*;

public abstract class AbstractTank implements Drawable, Destroyable {
    protected int speed = 5;

    protected Color tankColor;
    protected Color towerColor;
    private int x;
    private int y;
    private Direction direction;
    private ActionField af;
    private BattleField bf;

    public AbstractTank(ActionField af, BattleField bf) {
        this(af, bf, 128, 512, Direction.UP);
    }

    public AbstractTank(ActionField af, BattleField bf, int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.af = af;
        this.bf = bf;
    }

    public void turn(Direction direction) throws Exception {
        this.direction = direction;
        af.processTurn(this);
    }

    public void move() throws Exception {
        af.processMove(this);
    }

    public void fire() throws Exception {
        Bullet bullet = new Bullet(x + 25, y + 25, direction);
        af.processFire(bullet);
    }

    public void clean() throws Exception {
        for (int i = 0; i < bf.getH(); i++) {
            moveToQuadrant(1, i + 1);
            for (int j = 0; j < bf.getV(); j++) {
                if (bf.scanQuadrant(j, i).equals("B")) {
                    this.turn(direction.DOWN);
                    this.fire();
                }
            }
        }
        clean();
    }

//    public void moveRandom() throws Exception {
//        Random r = new Random();
//        int i;
//        while (true) {
//            i = r.nextDir(5);
//            if (i > 0) {
//                this.turn(i);
//                this.move();
//            }
//        }
//    }


    @Override
    public void draw(Graphics g) {
        g.setColor(tankColor);
        g.fillRect(this.getX(), this.getY(), 64, 64);

        g.setColor(towerColor);
        if (this.getDirection() == Direction.UP) {
            g.fillRect(this.getX() + 20, this.getY(), 24, 34);
        } else if (this.getDirection() == Direction.DOWN) {
            g.fillRect(this.getX() + 20, this.getY() + 30, 24, 34);
        } else if (this.getDirection() == Direction.LEFT) {
            g.fillRect(this.getX(), this.getY() + 20, 34, 24);
        } else {
            g.fillRect(this.getX() + 30, this.getY() + 20, 34, 24);
        }
    }

    public void destroy() {
        this.x = -100;
        this.y = -100;
    }

    public void moveToQuadrant(int v, int h) throws Exception {
        String coordinates = af.getQuadrantXY(v, h);
        int separator = coordinates.indexOf("_");
        int y = Integer.parseInt(coordinates.substring(0, separator));
        int x = Integer.parseInt(coordinates.substring(separator + 1));

        if (this.x < x) {
            while (this.x != x) {
                this.turn(direction.RIGHT);
                this.move();
            }
        } else {
            while (this.x != x) {
                this.turn(direction.LEFT);
                this.move();
            }
        }

        if (this.y < y) {
            while (this.y != y) {
                this.turn(direction.DOWN);
                this.move();

            }
        } else {
            while (this.y != y) {
                this.turn(direction.UP);
                this.move();
            }
        }
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

