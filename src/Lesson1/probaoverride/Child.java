package Lesson1.probaoverride;


import Lesson5.Frame4.*;

import java.lang.Integer;

public class Child extends Parents{


    @Override

    protected Integer method(int jj) throws NumberFormatException{
        return new Integer(1);
    }
}
