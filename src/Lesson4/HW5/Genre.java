package Lesson4.HW5;


public enum Genre {
    FANTASY(0), FOOD(1), COMPUTERS(2), FICTION(3), HISTORY(4);
    private int id;

    private  Genre(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
