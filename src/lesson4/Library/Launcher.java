package lesson4.Library;


public class Launcher {
    public static void main(String[] args) {
        AddBooksInWarehouse add = new AddBooksInWarehouse();
        Warehouse db = add.getLibrary();
        ServiceLibrary library = new ServiceLibrary(db);
        library.seachAuthor("Samuel Beckett");
        System.out.println("---------------------------------");
        library.seachTitle("Fairy tales");
        System.out.println("---------------------------------");
        library.seachGenre(Genre.FANTASY);
        library.seachGenre(Genre.FANTASY);
        library.seachGenre(Genre.FOOD);
        library.seachGenre(Genre.FANTASY);

    }
}
