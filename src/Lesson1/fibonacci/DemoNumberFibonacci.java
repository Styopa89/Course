package Lesson1.fibonacci;


import java.util.Scanner;

public class DemoNumberFibonacci {
    public static void main(String[] args) {
        NumberFibanacciBigInteger nf = new NumberFibanacciBigInteger();
        while (true) {
            System.out.println("BigInteger");
            System.out.println("What number Fibonacci would you like see?");
            System.out.println("Pleasse, write index");
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();
            nf.numberFibonachiWithTime(i);
        }
    }
}
