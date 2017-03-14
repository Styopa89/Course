package lesson8.guishop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List product = new ArrayList<Product>();
    public Shop() {
            addProduct();
    }

    public List getProduct() {
        return product;
    }

    public void setProduct(List product) {
        this.product = product;
    }

    private void addProduct(){
        product.add(new Product("AUDI"));
        product.add(new Product("BMW"));
        product.add(new Product("WV"));
        product.add(new Product("MERCEDES"));
    }

}
