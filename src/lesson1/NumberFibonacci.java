package lesson1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberFibonacci {

    private List<String> listNubmerFibonacci = new ArrayList<>();

    public NumberFibonacci() {
        listNubmerFibonacci.add("0");
        listNubmerFibonacci.add("1");
    }

    public static void main(String[] args) {
        NumberFibonacci nf = new NumberFibonacci();
        while (true) {
            System.out.println("What number Fibonacci would you like see?");
            System.out.println("Pleasse, write index");
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();
            nf.numberFibonachiWithTime(i);
        }
    }

    public void numberFibonachiWithTime(int number) {
        long time = System.currentTimeMillis();
        System.out.println(numberFibonacci(number));
        System.out.println("Time operations : " + (System.currentTimeMillis() - time) + " ms");
    }

    public String  numberFibonacci(int number) {
            while (number > listNubmerFibonacci.size()) {
                String lastElement = listNubmerFibonacci.get((listNubmerFibonacci.size()) - 1);
                String preLastElement = listNubmerFibonacci.get((listNubmerFibonacci.size()) - 2);
                listNubmerFibonacci.add(sumLastNumber(lastElement, preLastElement));
            }
        return  listNubmerFibonacci.get(--number);
    }

    private String sumLastNumber(String last, String preLast){
        if (last.length() > preLast.length()) {
            preLast = "0" + preLast;
        }
        int ten = 0;
        String result = "";
        for (int i = last.length() - 1; i >= 0; i-- ){
            int a = Character.getNumericValue(last.charAt(i));
            int b = Character.getNumericValue(preLast.charAt(i));
            int c = a + b + ten;
            ten = c / 10;
            c = c % 10;
            result = String.valueOf(c) + result;
        }
        if (ten !=0){
            result = ten + result;
        }
        return result;
    }



}
