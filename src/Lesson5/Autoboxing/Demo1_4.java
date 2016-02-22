package Lesson5.Autoboxing;

import java.lang.Double;
import java.lang.Integer;

public class Demo1_4 {
    public static void main(String[] args) {
        int a = (new Integer(10)).intValue();
        Double b = new Double(12);
        int c = 5;

        System.out.println(sum(a,c));
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
