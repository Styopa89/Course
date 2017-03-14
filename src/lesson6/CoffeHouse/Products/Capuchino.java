package lesson6.CoffeHouse.Products;


import lesson6.CoffeHouse.Ingridients.Coffe;
import lesson6.CoffeHouse.Ingridients.Milk;
import lesson6.CoffeHouse.Ingridients.Water;

public class Capuchino extends AbstractProduct {
    public Capuchino() {
        name = "Capuchino";
        product[0] = new Coffe();
        product[1] = new Water();
        product[2] = new Milk();

    }
}
