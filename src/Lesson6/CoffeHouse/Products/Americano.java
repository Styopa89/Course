package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Water;

public class Americano extends AbstractProduct {
    public Americano() {
        name = "Americano";
        product[0] = new Coffe();
        product[1] = new Water();
        product[1].setPortion(2);
    }
}