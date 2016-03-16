package Lesson7.simplearraylist;


public class DemoArrayList {

    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");
        list.addLast("8");
        list.addLast("9");
        list.addLast("10");
        list.addFirst("11");
        list.addFirst("12");
        list.addFirst("13");
        list.addAfter("11","14");
        list.addAfter("11","15");
        list.addAfter("11","16");
        list.printList();

        System.out.println("remove index");
        list.removeIndex(1);
        list.printList();

        System.out.println("remove Object");
        list.removeObject("9");
        list.printList();


    }
}
