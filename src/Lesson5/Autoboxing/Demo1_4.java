package Lesson5.Autoboxing;

import java.lang.Double;
import java.lang.Integer;

public class Demo1_4 {
    public static void main(String[] args) {
        Integer a = 10;
        Double b = new Double(12);
        int c = 5;

        System.out.println(sum(a, b));
    }

    public int sum(int a, int b){
        return a + b;
    }
}
