package Lesson7.MyFirstList;


import java.util.Iterator;

public class DemoTestList {

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addFirst("111");
        list.addFirst("222");
        list.addFirst("333");

        list.printList();
        System.out.println("-----------------------");
        list.addLast("444");
        list.addLast("777");
        list.addLast("888");
        list.printList();
        System.out.println("-----------------------");
        list.addFirst("555");
        list.printList();
        System.out.println("-----------------------");
        list.addAfter("666","555");
        list.printList();
        list.remove("111");
        list.printList();

        for (Object o : list){
            String str = (String) o;
            System.out.print(str + ", ");
        }
//        System.out.println();
//        for (Iterator<Object> it = list.iterator(); it.hasNext();){
//            Object o = it.next();
//            System.out.print(o + ", ");
//        }
        System.out.println();
        for (Iterator<Object> it = list.iterator(); it.hasNext();){
            it.next();
            it.next();
            it.remove();
            break;
        }
        list.printList();
    }
}
