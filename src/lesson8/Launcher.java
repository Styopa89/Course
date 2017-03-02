package lesson8;


import java.util.*;


public class Launcher {

    public static void main(String[] args) {
        List a= new ArrayList<Integer>();
        a.add(7);
        a.add(9);
        a.add(3);
        a.add(4);
        a.add(14);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(1);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(2);
        a.add(2);
        a.add(10);
        a.add(111);
        System.out.println(a.size());
        System.out.println(a.toString());
        Set b = new TreeSet<Integer>();
        b.addAll(a);
        System.out.println(b.size());
        System.out.println(b.toString());

    }
}
