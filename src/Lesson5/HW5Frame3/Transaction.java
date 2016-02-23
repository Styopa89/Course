package Lesson5.HW5Frame3;

import Lesson5.HW5Frame3.ShopCar.Car;

public class Transaction {
        private Car car;
        private Client client;
        private int number;


    public Transaction(Client client, Car car, int number) {
        this.car = car;
        this.client = client;
        this.number = number;
    }

    public Car getCar() {
        return car;
    }

    public Client getClient() {
        return client;
    }

    public int getNumber() {
        return number;
    }


}

