package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Water;

public class BlackTea extends AbstractProduct{
    public BlackTea() {
        name = "Black Tea";
        product[0] = new Lesson6.CoffeHouse.Ingridients.BlackTea();
        product[1] = new Water();
    }
}
