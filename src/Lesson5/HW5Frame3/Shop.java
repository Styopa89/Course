package Lesson5.HW5Frame3;

import Lesson5.HW5Frame3.ShopCar.Car;

public class Shop {
    private SellsJurnal jurnal;
    private Transaction transactions;
    private Client[] clients;
    private int sizeClient;
    private int sizeCars;
    private Car[] cars ;

    public Shop() {
        clients = new Client[30];
        cars = new Car[30];
        jurnal = new SellsJurnal();
        sizeCars = 0;
        sizeClient = 0;
    }

    public void printPrice(){
        for (int i = 0; i < sizeCars; i++){
            System.out.println("Brand: " + cars[i].getBrand() + "; Model: " + cars[i].getModel() +
                    "; Body: " + cars[i].getBody() + " ----- " + "price Car: " + cars[i].getPrice());
        }
    }

    public void infoInTheWarehouse(){
        this.printBDCars();
    }

    public void sellThisDay(){
        jurnal.sellThisDay();
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
        if (car.getAmount() >= amount && car.getAmount() > 0) {
            jurnal.newTransaction(new Transaction(client, car, amount));
            car.setAmount(car.getAmount() - amount);
        } else {
            System.out.println("You can't buy this car,  because there aren't many these cars on the warehouse");
        }
    }

    public void allSellWeek(){
        jurnal.allSellCarsWeek();
    }

    public void newDay(){
        jurnal.newDay();
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

}
