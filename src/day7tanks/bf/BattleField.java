package day7tanks.bf;

import day7tanks.bf.objbf.*;
import day7tanks.bf.tanks.*;
import java.awt.Graphics;

public class BattleField implements Drawable {


	public final static int QUADRANT_PX = 64;
	private int v = 9;
	private int h = 9;
	private int bfWidth = QUADRANT_PX * h;
	private	int bfHeight = QUADRANT_PX * v;
	private BFObject[][] battleFieldStatic;
//	private BFObject[][] battleFieldDinamic;


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
				{"B", " ", " ", "B", "E", "W", " ", " ", "B"}
		};
		this.battleFieldStatic = arrayBattleFildStatic(bf);
//		this.battleFieldDinamic = arrayBattleFieldDinamic();

	}

	public BattleField(String[][] bf) {
		this.battleFieldStatic = arrayBattleFildStatic(bf);
//		this.battleFieldDinamic = arrayBattleFieldDinamic();
	}

	private BFObject[][] arrayBattleFildStatic(String[][] bf) {
		BFObject[][] battleField = new BFObject[v][h];
		for (int i = 0; i < bf.length; i++) {
			for (int j = 0; j < bf[i].length;  j++) {
				String str = bf[i][j];
				if ("B".equals(str)) {
					battleField[i][j] = new Brick(i,j);
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

//	private BFObject[][] arrayBattleFieldDinamic () {
//		return new BFObject[v][h];
//	}
//
//	public void addTank(Tank tank) {
//		int v = tank.getY() / QUADRANT_PX;
//		int h = tank.getX() / QUADRANT_PX;
//		battleFieldDinamic[v][h] = tank;
//	}


//	private BFObject[][] generateBattleField() {
//		BFObject[][] battleField = new BFObject[v][h];
//		Random random = new Random();
//		for (int i = 0; i < v; i++) {
//			for (int j = 0; j < h;  j++) {
//				int k = random.nextInt(8) + 1;
//				if (k == 1 || k == 5 || k == 6) {
//					battleField[i][j] = new Brick(i,j);
//				} else if (k == 2 || k == 7 || k == 8) {
//					battleField[i][j] = new BFObject.Emply(i,j);
//				} else if (k == 3) {
//					battleField[i][j] = new Rock(i,j);
//				} else {
//					battleField[i][j] = new Water(i,j);
//				}
//			}
//
//		}
//		battleField[v-1][h/2] = new Eagle(v-1, h/2);
//		return battleField;
//	}

	public BFObject scanQuadrant(int v, int h) {
		return battleFieldStatic[v][h];
	}


		public void destroyObject(int v, int h) {
			battleFieldStatic[v][h] = new Emply(v*QUADRANT_PX,h*QUADRANT_PX);
		}

	@Override
	public void draw(Graphics g) {
		for (int j = 0; j < battleFieldStatic.length; j++) {
			for (int k = 0; k < battleFieldStatic.length; k++) {
				battleFieldStatic[j][k].draw(g);
//				if (battleFieldDinamic[j][k] != null) {
//					battleFieldDinamic[j][k].draw(g);
//				}

			}
		}
	}

	public void updateQuadrant(int v, int h, BFObject str) {
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
