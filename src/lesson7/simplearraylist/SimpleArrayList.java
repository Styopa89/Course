package lesson7.simplearraylist;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList implements Iterable<Object>{
    private int count;
    private Object list[];

    public SimpleArrayList() {
        this.list = new Object[10];
        this.count = 0;
    }

    public void addFirst(Object o){
        checkArray();
        System.arraycopy(list, 0, list, 1, count);
        list[0] = o;
        count++;
    }

    public void addLast(Object o){
        checkArray();
        list[count++] = o;
    }

    public void addAfter(Object oPrev, Object o){
        checkArray();
        for (int i = 0; i < count; i++){
            if (list[i].equals(oPrev)) {
                System.arraycopy(list, (i+1), list, (i+2), count-i-1);
                list[i+1] = o;
                count++;
                return;
            }
        }
        throw new IllegalStateException("Cann't search object");
    }

    public void removeIndex(int i){
        System.arraycopy(list, i, list, i-1, count-i);
        list[--count] = null;
    }

    public void removeObject(Object o) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(o)) {
                removeIndex(++i);
                return;
            }
        }
        throw  new IllegalStateException("Cann't search object");
    }

    private void checkArray(){
        if ( count  == list.length) {
            addSizeArray();
        }
    }

    private void addSizeArray(){
        Object[] listLast = new Object[((list.length*3)/2 + 1)];
        System.arraycopy(list, 0, listLast, 0, list.length);
        list = listLast;
    }

    public void printList(){
        System.out.println(Arrays.toString(list));
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getList() {
        return list;
    }

    @Override
    public Iterator<Object> iterator() {
        return new SALIterator();
    }



    class SALIterator implements Iterator<Object>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {


        }
    }


}
