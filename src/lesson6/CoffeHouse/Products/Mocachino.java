package lesson6.CoffeHouse.Products;


import lesson6.CoffeHouse.Ingridients.Coffe;
import lesson6.CoffeHouse.Ingridients.Milk;

public class Mocachino extends AbstractProduct {
    public Mocachino() {
        name = "Mocachino";
        product[0] = new Coffe();
        product[1] = new Milk();
        product[1].setPortion(2);

    }
}
