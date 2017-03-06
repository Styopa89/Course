package shop;


import shop.db.Shop;
import shop.product.Product;


import java.util.List;

public class LauncherConsole {

    public static void main(String[] args) {
        Shop shop = new Shop();
        List<Product> prod = shop.getProducts();
        for (Product p: prod){
            System.out.println(p.getCategory());
        }
    }
}
