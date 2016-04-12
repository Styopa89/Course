package day7tanks.bf.objbf;

import day7tanks.bf.Destroyable;
import day7tanks.bf.Drawable;


public interface BFObject extends Drawable, Destroyable {

    public int getX();

    public int getY();

    public int getVertical();

    public int getHorizontal();

}
