package Lesson4.Library;

import java.util.Arrays;

public class ServiceLibrary {
    private int size;
    private Book[] library;
    private Book [] sortAuthorLibrary;
    private Book[] sortTitleLibrary;
    private Genre genre = null;
    private int seachThisGenre = 0;


    public ServiceLibrary(Warehouse db) {
        size = db.getSize();
        library = db.getLibrary();
        sortAuthorLibrary = sortAutor(db.getLibrary());
        sortTitleLibrary = sortTitle(db.getLibrary());

    }

    public void seachAuthor(String author) {
        System.out.println("Result seach Author " + author);
        for (int i = 0; i < size; i++) {
            if (sortAuthorLibrary[i].getAuthor().equals(author)) {
                printBook(sortAuthorLibrary[i]);
                return;
            }
        }
            System.out.println("sorry, we don't found your author");

    }
    public void seachGenre (Genre g){
        Book[] thisGenre = sortGente(library,g);
        System.out.println("Result seach genre " + g.name());
        if (g != genre) {
            genre = g;
            seachThisGenre = 0;
        }
        for (int i = 0; (i < 5) && (seachThisGenre < thisGenre.length); i++) {
            printBook(thisGenre[seachThisGenre]);
            seachThisGenre++;
        }
    }

    public void seachTitle(String title) {
        System.out.println("Result seach Title " + title);
        for (int i = 0; i < size; i++) {
            if (sortAuthorLibrary[i].getTitle().equals(title)) {
                printBook(sortAuthorLibrary[i]);
                return;
            }
        }
            System.out.println("sorry, we don't found your book");

    }
    public void printAllBookAuthor(){
        for (int i = 0; i < size; i++) {
            printBook(sortAuthorLibrary[i]);
        }
    }

    private void printBook(Book book) {
        System.out.println("Author: " + book.getAuthor() + ", Title: " + book.getTitle() + ", Genre:  " + book.getGenre());
    }

    private Book[] sortAutor (Book[] l){
        String[] str = new String[size];
        for (int i = 0; i < size; i++){
            str[i] = l[i].getAuthor();
        }
        Arrays.sort(str);
        Book[] sort = new Book[l.length];
        for(int i = 0; i <  size; i++) {
            for (int j = 0; j < size; j++) {
                if (str[i].equals(l[j].getAuthor())){
                    sort[i] = l[j];
                }
            }
        }
        return sort;

    }

    private Book[] sortTitle (Book[] l){
        String[] str = new String[size];


        for (int i = 0; i < size; i++){
            str[i] = l[i].getTitle();
        }
        Arrays.sort(str);
        Book[] sort = new Book[l.length];
        for(int i = 0; i <  size; i++) {
            for (int j = 0; j < size; j++) {
                if (str[i].equals(l[j].getTitle())){
                    sort[i] = l[j];
                }
            }
        }
        return sort;

    }

    private Book[] sortGente (Book[] l, Genre g){
        int n = 0;
        Book sortBig[] = new Book[size];
        for (int i = 0; i < size; i++){
            if (g == l[i].getGenre()){
                sortBig[n] = l[i];
                n++;
            }
        }
        Book sort[] = new Book[n];
        for (int i = 0; i < n; i++){
            sort[i] = sortBig[i];
        }
        System.arraycopy(sortBig, 0, sort,0, n);
        return sort;

    }



}
