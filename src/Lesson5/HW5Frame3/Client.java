package Lesson5.HW5Frame3;

public class Client {
    private String name;
    private String secondName;
    private int balanceBuy;
    private int discont;
    private Car car;

    public Client(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBalanceBuy() {
        return balanceBuy;
    }

    public void setBalanceBuy(int balanceBuy) {
        this.balanceBuy = balanceBuy;
    }

    public int getDiscont() {
        return discont;
    }

    public void setDiscont(int discont) {
        this.discont = discont;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
