package shop.db;

import shop.product.*;


import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List products = new ArrayList<Product>();
    private int id = 0;
    public Shop() {
            addProduct();
    }

    public List getProducts() {
        return products;
    }

//    public void setProducts(List products) {
//        this.products = products;
//    }

    private void addProduct(){
        products.add(new PC());
        products.add(new PC("Dell", "F12"));
        products.add(new Desktop());
        products.add(new Desktop("Asus", "KE19"));

    }

}
