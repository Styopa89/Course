package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.AbstractIngridient;
import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Milk;
import Lesson6.CoffeHouse.Ingridients.Water;

public class GreenTea extends AbstractProduct {
    public GreenTea() {
        name = "Green Tea";
        product[0] = new Lesson6.CoffeHouse.Ingridients.GreenTea();
        product[1] = new Water();
    }
}
