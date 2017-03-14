package lesson1.probaoverride;


import java.lang.Integer;

public class Child extends Parents{


    @Override

    protected Integer method(int jj) throws NumberFormatException{
        return new Integer(1);
    }
}
