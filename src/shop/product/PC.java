package shop.product;

public class PC extends Product{

    public PC() {
        super("PC", "no info", "no info");
    }

    public PC(String brandName, String model) {
        super("PC", brandName, model);
    }
}
