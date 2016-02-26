package Lesson5.HW5Frame3;


public class DemoShopCar {
    public static void main(String[] args) {
        TestShop ts = new TestShop();
        Shop shop = ts.getSh();
        System.out.println("-------------PRICE--------------");
        shop.printPrice();
        System.out.println("-------------AMOUNT IN THE WAREHOUSE--------------");
        shop.infoInTheWarehouse();

        System.out.println("------------SELL IN THE LAST WEEK------------------");
        shop.allSellWeek();

        System.out.println("----------PURCHASE IN THIS DAY--------------");
        shop.sellThisDay();
        System.out.println("The end");

    }
}
