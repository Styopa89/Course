package Lesson5.HW5Frame3.ShopCar;


public class Car {
    private Brand brand;
    private String model;
    private Body body;
    private int price;
    private int amount;

    public Car() {
    }

    public Car(Brand brand, String model, Body body, int price, int amount) {
        this.brand = brand;
        this.model = model;
        this.body = body;
        this.price = price;
        this.amount = amount;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
