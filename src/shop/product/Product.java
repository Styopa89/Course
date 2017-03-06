package shop.product;


public abstract class Product {

    private static int id;
    private String category;
    private String brandName;
    private String model;


    public Product(String category) {
        this.category = category;
    }

    public Product(String category, String brandName, String model) {
        this(category);
        this.brandName = brandName;
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return getCategory();
    }
}
