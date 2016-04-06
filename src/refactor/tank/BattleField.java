package refactor.tank;


import java.awt.*;
import java.util.Random;

import refactor.tank.Interface.Drawable;
import refactor.tank.ObjectBattleField.*;
import refactor.tank.Tanks.Tiger;

public class BattleField implements Drawable {

        private final static int QUADRANT_PX = 64;
        private int v = 9;
        private int h = 9;
        private int bfWidth = QUADRANT_PX * h;
        private	int bfHeight = QUADRANT_PX * v;
        private ObjectBattleField[][] battleFieldStatic;


        public BattleField() {

            String[][] bf = {
                    {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
                    {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
                    {"B", "B", " ", " ", "B", " ", "B", "B", "B"},
                    {"B", "B", "R", " ", "W", " ", "B", "B", "B"},
                    {"B", "B", "W", " ", "W", " ", "B", "B", "B"},
                    {"B", "B", "B", "R", "R", "R", " ", "B", "B"},
                    {"B", "B", " ", " ", " ", " ", " ", "B", "B"},
                    {"B", " ", " ", "B", "B", "B", " ", " ", "B"},
                    {"B", " ", " ", "B", "E", "B", " ", " ", "B"}
            };
            this.battleFieldStatic = arrayToListBattleFild(bf);

        }

        public BattleField(String[][] bf) {
            this.battleFieldStatic = arrayToListBattleFild(bf);
        }

    private ObjectBattleField[][] arrayToListBattleFild (String[][] bf) {
        ObjectBattleField[][] battleField = new ObjectBattleField[v][h];
        for (int i = 0; i < bf.length; i++) {
            for (int j = 0; j < bf[i].length;  j++) {
                String str = bf[i][j];
                if ("B".equals(str)) {
                    battleField[i][j] = new Brink(i,j);
                } else if (" ".equals(str)) {
                    battleField[i][j] = new Emply(i,j);
                } else if ("R".equals(str)) {
                    battleField[i][j] = new Rock(i,j);
                } else if ("W".equals(str)){
                    battleField[i][j] = new Water(i,j);
                } else {
                    battleField[i][j] = new Eagle(i,j);
                }
            }

        } return battleField;

    }

    private ObjectBattleField[][] generateBattleField() {
        ObjectBattleField[][] battleField = new ObjectBattleField[v][h];
        Random random = new Random();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h;  j++) {
                int k = random.nextInt(8) + 1;
                    if (k == 1 || k == 5 || k == 6) {
                        battleField[i][j] = new Brink(i,j);
                    } else if (k == 2 || k == 7 || k == 8) {
                        battleField[i][j] = new Emply(i,j);
                    } else if (k == 3) {
                        battleField[i][j] = new Rock(i,j);
                    } else {
                        battleField[i][j] = new Water(i,j);
                    }
                }

            }
            battleField[v-1][h/2] = new Eagle(v-1, h/2);
            return battleField;
        }

        public ObjectBattleField scanQuadrant(int v, int h) {
            return battleFieldStatic[v][h];
        }

        public boolean hitBullet(Bullet b){
            v = b.getX()/64;
            h = b.getY()/64;

            if (battleFieldStatic[h][v] instanceof Emply || battleFieldStatic[h][v] instanceof Water) {
                return false;
            }
            if (battleFieldStatic[h][v] instanceof Rock && !(b.getTank() instanceof Tiger)){
                return true;
            }
            battleFieldStatic[h][v] = new Emply(h,v);
            return true;
        }

    @Override
    public void draw(Graphics g) {
        for (int j = 0; j < battleFieldStatic.length; j++) {
            for (int k = 0; k < battleFieldStatic.length; k++) {
                battleFieldStatic[j][k].draw(g);
            }
        }
    }

       public void updateQuadrant(int v, int h, ObjectBattleField str) {
        battleFieldStatic[v][h] = str;
        }

        public int getQuadratPx() {
            return QUADRANT_PX;
        }
        public int getBfWidth() {
            return bfWidth;
        }
        public int getBfHeight() {
            return bfHeight;
        }
}
