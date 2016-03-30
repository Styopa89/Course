package lesson8.guishop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List product = new ArrayList<>();
    public Shop() {

    }

    private void addProduct(){
        product.add(new Product("audi"));
        product.add(new Product("bmw"));
        product.add(new Product("wv"));
    }

}
