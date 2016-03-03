package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Milk;

public class Mocachino extends AbstractProduct {
    public Mocachino() {
        name = "Mocachino";
        product[0] = new Coffe();
        product[1] = new Milk();
        product[1].setPortion(2);

    }
}
