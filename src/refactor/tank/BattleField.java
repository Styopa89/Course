package refactor.tank;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import refactor.tank.objectbattlefield.*;

public class BattleField {

        private final static int QUADRANT_PX = 64;
        private int v = 9;
        private int h = 9;
        private int bfWidth = QUADRANT_PX * h;
        private	int bfHeight = QUADRANT_PX * v;
        private ObjectBattleField[][] battleField ;

        public BattleField() {
            this.battleField = generateBattleField();

        }

        public BattleField(String[][] bf) {
            this.battleField = arrayToListBattleFild(bf);
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
            return battleField[v][h];
        }

        public int getDimentionY() {
        return battleField.length;
    }

       public int getDimentionX() {
        return battleField[0].length;
    }
       public void updateQuadrant(int v, int h, ObjectBattleField str) {
        battleField[v][h] = str;
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

        public int getV() {
            return v;
        }

        public int getH() {
            return h;
        }
}
