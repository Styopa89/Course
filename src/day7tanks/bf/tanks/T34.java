package day7tanks.bf.tanks;

import java.awt.Color;

import day7tanks.Direction;
import day7tanks.bf.BattleField;

public class T34 extends AbstractTank {
	
	public T34(BattleField bf) {
		super(bf, 128, 512, Direction.UP);
		tankColor = new Color(0, 255, 0);
		towerColor = new Color(255, 0, 0);
	}
	
	public T34(BattleField bf, int x, int y, Direction direction) {
		super(bf, x, y, direction);
		tankColor = new Color(0, 255, 0);
		towerColor = new Color(255, 0, 0);
	}

	private Object[] actoins = new Object[] {
		Direction.RIGHT,
		Action.FIRE,
		Action.MOVE,
		Action.FIRE,
		Action.MOVE,
		Action.FIRE,
		Action.FIRE
	};
	
	private int step = 0;
	
	@Override
	public Action setUp() {
		if (step >= actoins.length) {
			step = 0;
		}
		if (!(actoins[step] instanceof Action)) {
			turn((Direction) actoins[step++]);
		}
		if (step >= actoins.length) {
			step = 0;
		}
		return (Action) actoins[step++];
	}
}
