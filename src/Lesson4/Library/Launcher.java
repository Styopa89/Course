package Lesson4.Library;


public class Launcher {
    public static void main(String[] args) {
        AddBooksInWarehouse add = new AddBooksInWarehouse();
        Warehouse db = add.getLibrary();
        System.out.println(db.getSize());
        System.out.println("end!");
        db.sortAutor(db.getLibrary());
    }
}
