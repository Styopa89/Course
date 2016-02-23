package Lesson5.HW5Frame3;

import Lesson5.HW5Frame3.Car.Car;

public class Shop {

    private Transaction[][] transactions;
    private Client[] clients;
    private int sizeClient;
    private int sizeCars;
    private Car[] cars ;
    private int day;
    private int purcheseNumber;

    public Shop() {
        transactions = new Transaction[8][30];
        clients = new Client[30];
        cars = new Car[30];
        day = 0;
        sizeCars = 0;
        sizeClient = 0;
        purcheseNumber = 0;
    }

    public void buyCar(Client client, Car car, int amount) {
        transactions[day][purcheseNumber++] = new Transaction(client, car, amount);
    }

    public void newDay (){
        day++;
        purcheseNumber = 0;
    }

    public void addCar(Car car) {
        cars[sizeCars++] = car;
    }


}
