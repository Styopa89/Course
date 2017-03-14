package lesson6.CoffeHouse.Products;


import lesson6.CoffeHouse.Ingridients.Coffe;
import lesson6.CoffeHouse.Ingridients.Milk;
import lesson6.CoffeHouse.Ingridients.Water;

public class CoffeWithMilk extends AbstractProduct {
    public CoffeWithMilk() {
        name = "Coffe with milk";
        product[0] = new Coffe();
        product[1] = new Water();
        product[2] = new Milk();
    }
}
