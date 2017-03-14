package lesson6.CoffeHouse.Products;


import lesson6.CoffeHouse.Ingridients.Water;

public class BlackTea extends AbstractProduct{
    public BlackTea() {
        name = "Black Tea";
        product[0] = new lesson6.CoffeHouse.Ingridients.BlackTea();
        product[1] = new Water();
    }
}
