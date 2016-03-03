package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Water;

public class BlackCoffe extends AbstractProduct {
    public BlackCoffe() {
        name = "BlackCoffe";
        product[0] = new Coffe();
        product[1] = new Water();
    }
}
