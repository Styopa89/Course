package Lesson5.HW5Frame3;


public class DemoShopCar {
    public static void main(String[] args) {
        TestShop ts = new TestShop();
        Shop shop = ts.getSh();

//        shop.printBDClient();
        System.out.println("--------------------------------------------------");
//        shop.printBDCars();
        shop.allSellCarsWeek();

    }
}
