package day7tanks.bf.tanks;

import java.awt.Color;

import day7tanks.bf.Direction;
import day7tanks.bf.BattleField;

public class BT7 extends AbstractTank {
	
	public BT7(BattleField bf) {
		super(bf);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
		movePath = 2;
	}
	
	public BT7(BattleField bf, int x, int y, Direction direction) {
		super(bf, x, y, direction);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
		movePath = 2;
	}


	public void destroyEagle(){

	}


	@Override
	public Action setUp() {
		return Action.FIRE;
	}
}
