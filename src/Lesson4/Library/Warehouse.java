package Lesson4.Library;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Warehouse {

    private Book[] library = new Book[10];
    private int size = 0;
    private Book[] sortAutorLibrery;

    public Warehouse (){

    }

    public Book[] getLibrary() {
        return library;
    }

    public void setLibrary(Book[] library) {
        this.library = library;
    }
    public int getSize() {
        return size;
    }

    public Book[] addBook(Book book){
      if (size == library.length) {
            zoomLibrary();
      }
        library[size] = book;
        size++;
        return library;
    }
    private Book[] zoomLibrary() {
        Book[] zoomLibrary = new Book[size /2*3];
        System.arraycopy(library, 0, zoomLibrary,0, size);
        return library = zoomLibrary;
    }

//    public Book[] sortAutor (Book[] l){
//
//        String[] str ;
//         Arrays.sort(str);
//        for(int i = 0; i <  str.length; i++) {
//            System.out.print(str[i] + "  ");

//        }
//        return l;
//    }
//    private String[](Book[] lib){
//        String[][]
//    }






}
