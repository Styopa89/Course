package Lesson7.ListSort;


import java.util.Collections;
import java.util.LinkedList;

public class DemoSort  {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Comparator c = new Comparator();
        list.add("sdgf");
        list.add("dfghv");
        list.add("ewdfew");
        list.add("ewcrg");
        list.add("xrewfcvg");
        list.add("crefvg");
        list.add("awefd");
        list.add("ctghtgfh");
        list.add("cbrebtgs");
        list.add("jmubm");
        for (String l : list ){
            System.out.print(l + "  ");
            System.out.println();
        }
        Collections.sort(list, c);

        for (String l : list ){
            System.out.print(l + "  ");
        }

    }



}
