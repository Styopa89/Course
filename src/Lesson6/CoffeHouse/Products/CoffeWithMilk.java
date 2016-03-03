package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Milk;
import Lesson6.CoffeHouse.Ingridients.Water;

public class CoffeWithMilk extends AbstractProduct {
    public CoffeWithMilk() {
        name = "Coffe with milk";
        product[0] = new Coffe();
        product[1] = new Water();
        product[2] = new Milk();
    }
}
