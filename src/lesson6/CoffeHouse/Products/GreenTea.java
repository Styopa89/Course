package lesson6.CoffeHouse.Products;


import lesson6.CoffeHouse.Ingridients.Water;

public class GreenTea extends AbstractProduct {
    public GreenTea() {
        name = "Green Tea";
        product[0] = new lesson6.CoffeHouse.Ingridients.GreenTea();
        product[1] = new Water();
    }
}
