package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Milk;
import Lesson6.CoffeHouse.Ingridients.Water;

public class Capuchino extends AbstractProduct {
    public Capuchino() {
        name = "Capuchino";
        product[0] = new Coffe();
        product[1] = new Water();
        product[2] = new Milk();

    }
}
