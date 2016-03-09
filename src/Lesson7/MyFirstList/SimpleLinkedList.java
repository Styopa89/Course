package Lesson7.MyFirstList;


public class SimpleLinkedList {
    private Node root;
    private int size;

    public SimpleLinkedList() {
       size = 0;
       root = new Node();
    }

    public void addFirst(Object obj) {
        Node n = new Node();
        n.obj = obj;
        if(root != null) {
            n.node = root;
        }
        root = n;
        size++;
    }

    public void addLast(Object obj) {
        Node n = new Node();
        n.obj = obj;

        if ( root == null) {
            root = n;
        } else {
            Node last = root;
            Node cp = root;
            while (cp.node != null) {
                last = cp;
                cp = cp.node;
            }
            last.node = n;
        }
        size++;
    }

    public void addAfter(Object newObj, Object prevObj) {

    }

    public int getSize() {
        return size;
    }

    private class Node {
        private Object obj;
        private Node node;

    }
}


