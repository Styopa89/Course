package lesson6.CoffeHouse.Products;


import lesson6.CoffeHouse.Ingridients.Coffe;
import lesson6.CoffeHouse.Ingridients.Water;

public class Americano extends AbstractProduct {
    public Americano() {
        name = "Americano";
        product[0] = new Coffe();
        product[1] = new Water();
        product[1].setPortion(2);
    }
}
