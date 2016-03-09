package Lesson7.MyFirstList;


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

    }
}
