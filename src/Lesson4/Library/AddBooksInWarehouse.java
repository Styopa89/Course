package Lesson4.Library;


public class AddBooksInWarehouse {

    public AddBooksInWarehouse(){
        pushBook("Chinua Achebe","Things Fall Apart", Genre.FANTASY);
        pushBook("Dante Alighieri","The Divine Comedy", Genre.FANTASY);
        pushBook("Hans Christian Andersen","Fairy tales", Genre.FICTION);
        pushBook("Jane Austen","Pride and Prejudice", Genre.COMPUTERS);
        pushBook("Samuel Beckett","Molloy, Malone Dies, The Unnamable", Genre.FOOD);
        pushBook("Giovanni Boccaccio","The Decameron", Genre.FANTASY);
        pushBook("Jorge Luis Borges","Ficciones", Genre.FOOD);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.COMPUTERS);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.FANTASY);
        pushBook("","", Genre.HISTORY);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.FANTASY);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.FANTASY);
        pushBook("","", Genre.HISTORY);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.FOOD);
        pushBook("","", Genre.HISTORY);
        pushBook("","", Genre.FANTASY);
        pushBook("","", Genre.COMPUTERS);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.FANTASY);
        pushBook("","", Genre.COMPUTERS);
        pushBook("","", Genre.FOOD);
        pushBook("","", Genre.FOOD);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.HISTORY);
        pushBook("","", Genre.COMPUTERS);
        pushBook("","", Genre.FICTION);
        pushBook("","", Genre.HISTORY);
        pushBook("","", Genre.HISTORY);
        pushBook("","", Genre.FOOD);
    }
    private Warehouse library = new Warehouse();

    public Warehouse getLibrary() {
        return library;
    }

    public void pushBook(String autor, String name, Genre genre) {
        Book book = new Book();
        book.setAuthor(autor);
        book.setTitle(name);
        book.setGenre(genre);
        library.addBook(book);
    }


}
