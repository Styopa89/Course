package Tank;


import java.util.Random;

public class BattleField {

        private int quadratPx = 64;
        private int v = 9;
        private int h = 9;
        private int bfWidth = quadratPx * h;
        private	int bfHeight = quadratPx * v;
        private String[][] battleField;

        public BattleField() {
            this.battleField = generateBattleField(v, h);
        }

        public BattleField(String[][] battleField) {
            this.battleField = battleField;
        }

        private String[][] generateBattleField( int v, int h) {
            Random random = new Random();
            String[][] battleField = new String[v][h];
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h;  j++) {
                    int k = random.nextInt(2) + 1;
                    if (k == 1) {
                        battleField[i][j] = " ";
                    } else {
                        battleField[i][j] = "B";
                    }
                }

            } return battleField;
        }

        public String scanQuadrant(int v, int h) {
            return battleField[v][h];
        }

        public void updateQuadrant(int v, int h, String str) {
            battleField[v][h] = str;
        }

        public String getRandomLacationAgressor() {
           String location = "0_128";
            int x = 0;
            int y = 2;
            Random random = new Random();
            int i = random.nextInt(2);
            if (i == 0) {
                location = (v/2 * quadratPx) + "_128";
                x = v/2;
            }
            if (i == 1) {
                location = ((v - 1) * quadratPx) + "_128";
                x = v -1;
            } System.out.println(y + "_" + x);
            if ("B".equals(battleField[y][x])) {
                System.out.println(battleField[y][x]);
                battleField[y][x] = " ";
                System.out.println(battleField[y][x]);
            }
            return location;
        }


        public int getDimentionY() {
            return battleField.length;
        }

        public int getDimentionX() {
            return battleField[0].length;
        }

        public int getQuadratPx() {
            return quadratPx;
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
