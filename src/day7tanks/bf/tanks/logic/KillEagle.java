package day7tanks.bf.tanks.logic;


import day7tanks.bf.BattleField;
import day7tanks.bf.tanks.Action;
import day7tanks.bf.tanks.Tank;

public class KillEagle {
    private BattleField bf;
    private Tank t;
    private Action a;

    public KillEagle(BattleField bf, Tank t) {
        this.bf = bf;
        this.t = t;
    }

    public Action getAction(){
        return Action.MOVE;
    }
}
