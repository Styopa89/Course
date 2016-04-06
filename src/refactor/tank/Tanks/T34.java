package refactor.tank.Tanks;




import refactor.tank.Direction;
import java.awt.*;

public class T34 extends AbstractTank {



    public T34() {
        super();
        tankColor = new Color(255,0,0);
        towerColor = new Color(0,255,0);
    }

    public T34( int x, int y, Direction direction) {
        super( x, y, direction);
        tankColor = new Color(255,0,0);
        towerColor = new Color(0,255,0);
    }

    @Override
    void destroy() {

    }
}
