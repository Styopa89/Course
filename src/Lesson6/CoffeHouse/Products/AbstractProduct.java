package Lesson6.CoffeHouse.Products;


import Lesson6.CoffeHouse.Ingridients.AbstractIngridient;

public class AbstractProduct {
    protected AbstractIngridient[] product = new AbstractIngridient[10];
    protected String name;

    public void addIngridient(AbstractIngridient aI) {

    }

    public String namesIngridient() {
        String nameIngridient = "";
        for (int i = 0; i < product.length && product[i] != null; i++) {
            nameIngridient = nameIngridient + product[i].getNameIngradient() + ", ";
        }
        return nameIngridient;
    }

    public int priceProduct(){
        int price = 0;
        for (int i = 0; i < product.length && product[i] != null; i++){
            price += product[i].getPrice()*product[i].getPortion();
        }
        return price;
    }
    public String getName() {
        return name;
    }
}
