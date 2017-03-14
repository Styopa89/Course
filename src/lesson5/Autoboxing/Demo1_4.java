package lesson5.Autoboxing;

import java.lang.Integer;

public class Demo1_4 {
    public static void main(String[] args) {

        Integer b = new Integer(12);
        int a = (new Integer(b)).intValue();
        int c = 5;

        System.out.println(sum(a,c));
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
