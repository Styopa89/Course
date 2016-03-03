package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.*;
import Lesson6.CoffeHouse.Ingridients.BlackTea;

public class TeaWithBergamont extends AbstractProduct {
    public TeaWithBergamont() {
        name = "Tea with bergamont";
        product[0] = new BlackTea();
        product[1] = new Bergamont();
    }
}
