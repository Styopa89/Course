package lesson4.Library;


public class AddBooksInWarehouse {

    public AddBooksInWarehouse(){
        pushBook("Jorge Luis Borges","Ficciones", Genre.FOOD);
        pushBook("Chinua Achebe","Things Fall Apart", Genre.FANTASY);
        pushBook("Jane Austen","Pride and Prejudice", Genre.COMPUTERS);
        pushBook("Giovanni Boccaccio","The Decameron", Genre.FANTASY);
        pushBook("Dante Alighieri","The Divine Comedy", Genre.HISTORY);
        pushBook("Hans Christian Andersen","Fairy tales", Genre.FICTION);
        pushBook("Samuel Beckett","Molloy, Malone Dies, The Unnamable", Genre.FOOD);


        pushBook("a","q", Genre.FICTION);
        pushBook("s","w", Genre.COMPUTERS);
        pushBook("d","e", Genre.FICTION);
        pushBook("f","r", Genre.FANTASY);
        pushBook("g","t", Genre.HISTORY);
        pushBook("h","y", Genre.FICTION);
        pushBook("j","u", Genre.FANTASY);
        pushBook("k","i", Genre.FICTION);
        pushBook("l","o", Genre.FANTASY);
        pushBook("q","p", Genre.HISTORY);
        pushBook("w","a", Genre.FICTION);
        pushBook("e","s", Genre.FOOD);
        pushBook("r","d", Genre.HISTORY);
        pushBook("t","f", Genre.FANTASY);
        pushBook("y","g", Genre.COMPUTERS);
        pushBook("u","h", Genre.FICTION);
        pushBook("i","j", Genre.FANTASY);
        pushBook("o","k", Genre.COMPUTERS);
        pushBook("p","l", Genre.FOOD);
        pushBook("z","z", Genre.FOOD);
        pushBook("x","m", Genre.FICTION);
        pushBook("c","n", Genre.HISTORY);
        pushBook("v","b", Genre.COMPUTERS);
        pushBook("b","v", Genre.FICTION);
        pushBook("n","c", Genre.HISTORY);
        pushBook("m","x", Genre.HISTORY);
        pushBook("as","dd", Genre.FOOD);
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
