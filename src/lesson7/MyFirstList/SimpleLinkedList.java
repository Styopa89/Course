package lesson7.MyFirstList;


import java.util.Iterator;

public class SimpleLinkedList implements Iterable<Object> {
    private Node root;
    private int size;

    public SimpleLinkedList() {
       size = 0;
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
        if (root != null) {
            Node cp = root;
            while (cp.node != null) {
                cp = cp.node;
            }
            cp.node = n;
        } else {
            root = n;
        }
        size++;
    }

    public void addAfter(Object newObj, Object prevObj) {
        Node n = new Node();
        n.obj = newObj;
        Node cp = root;
            while (cp != null){
                if (cp.obj.equals(prevObj)) {
                    n.node = cp.node;
                    cp.node = n;
                    size++;
                    return;
                }
                cp = cp.node;
            }
        throw  new IllegalStateException("Cann't search object");
    }

    public void remove(Object obj){
        Node cp = root;
        Node pred = root;
        if (root.obj.equals(obj)){
            root = root.node;
            size--;
            return;
        }
        while (cp != null){
            if (cp.obj.equals(obj)) {
               pred.node = cp.node;
                size--;
                return;
            }
            pred = cp;
            cp = cp.node;
        }
        throw  new IllegalStateException("Cann't search object");
    }

    public int getSize() {
        return size;
    }

    public void printList(){
        if (size != 0){
            Node cp = root;
            while (cp.node != null) {
                System.out.print(cp.obj + ", ");
                cp = cp.node;
            }
            System.out.println(cp.obj);
        }
    }

    private class Node {
        private Object obj;
        private Node node;

    }

    @Override
    public Iterator<Object> iterator() {
        return new SLLIterator();
    }



     class SLLIterator implements Iterator<Object>{
        private Node cp;
         private Node prev;


         public SLLIterator() {
         }


         @Override
         public boolean hasNext() {
             return (cp == null && root != null) || (cp != null && cp.node != null);
         }

         @Override
         public Object next() {
             if (cp == null && root != null){
                 cp = root;
                 return cp.obj;
             }
             if (hasNext()){
                 prev = cp;
                 cp = cp.node;
                 return cp.obj;
             }
             throw  new IllegalStateException("List don't have more elements");
         }

         @Override
         public void remove() {
            if (!hasNext() && prev == null) {
                cp = null;
                root = null;
            } else if(!hasNext() && prev != null) {
                prev.node = null;
                cp = null;
            } else  if(hasNext() && prev == null) {
                root = cp.node;
                cp = root;
            } else {
                prev.node = cp.node;
                cp = cp.node;
            }
            size--;
         }
     }
}


