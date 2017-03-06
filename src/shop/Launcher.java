package shop;


import shop.db.Shop;

public class Launcher {

    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopUI ui = new ShopUI(shop);
    }

}
