package Lesson5.HW5Frame3;

import Lesson5.HW5Frame3.ShopCar.Car;

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

    public void printBDClient() {
        for (int i = 0; i < sizeClient; i++){
            System.out.println("Name: " + clients[i].getName() + ", Second Name: " + clients[i].getSecondName() +
                ", Phone number: " +clients[i].getPhoneNumber() + ";");
        }
    }

    public void printBDCars() {
        for (int i = 0; i < sizeCars; i++){
            System.out.println("Brand: " + cars[i].getBrand() + "; Model: " + cars[i].getModel() +
                    "; Body: " + cars[i].getBody() + " ----- " + "amount Car: " + cars[i].getAmount());
        }
    }

    public void buyCar(Client client, Car car, int amount) {
        System.out.println(day);
        if (car.getAmount() >= amount && car.getAmount() > 0) {
            transactions[day][purcheseNumber++] = new Transaction(client, car, amount);
            car.setAmount(car.getAmount() - amount);
        } else {
            System.out.println("You can't buy this car,  because there aren't many these cars on the warehouse");
        }
    }

    public void newDay (){
        day++;
        purcheseNumber = 0;
    }

    public void addCar(Car car) {
        cars[sizeCars++] = car;
    }
    public void addClients(Client client){
        clients[sizeClient++] = client;
    }

    public Client[] getClients() {
        return clients;
    }

    public Car[] getCars() {
        return cars;
    }

    public void allSellCarsWeek(){
        for (int i = 0; i < 7; i++){
            System.out.print((i+1) + " day sell: " + this.sellCarsInDay(transactions[day-7+i]) + " cars; ");
        }
    }
    private int sellCarsInDay(Transaction[] tr){
        int size = 0;
        for (int i = 0; tr[size] != null; i++){
            size += tr[size].getNumber();
        }
        return size;
    }
}
