package lesson6.CoffeHouse.Products;


import lesson6.CoffeHouse.Ingridients.Coffe;
import lesson6.CoffeHouse.Ingridients.Water;

public class BlackCoffe extends AbstractProduct {
    public BlackCoffe() {
        name = "BlackCoffe";
        product[0] = new Coffe();
        product[1] = new Water();
    }
}
