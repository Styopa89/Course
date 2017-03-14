package lesson7.stack;

import java.util.LinkedList;

public class Stack {

    private LinkedList list = new LinkedList();

    public Stack() {
    }

    public void push(Object o){
        list.addLast(o);
    }

    public Object pop(){
        Object o = list.getFirst();
        list.removeFirst();
        return o;
    }

    public Object peak(){
        return list.getFirst();
    }

    public void printList(){
        for (Object o : list){
            if(o instanceof String){
                System.out.print(((String) o) + " ");
            }
        }
        System.out.println();
    }

}
