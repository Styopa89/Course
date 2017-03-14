package lesson6.CoffeHouse.Ingridients;

public abstract class AbstractIngridient {
    private String nameIngradient;
    private int price;
    private int portion;

    public String getNameIngradient() {
        return nameIngradient;
    }

    protected void setNameIngradient(String nameIngradient) {
        this.nameIngradient = nameIngradient;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }
}
