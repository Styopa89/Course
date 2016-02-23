package Lesson5.HW5Frame3;


public class Transaction {
    private Car[] cars;
    private Client[] clients;
    private SalesJornal[] salesJornals;

    public Transaction() {
        Car[] cars = new Car[20];
        Client[] clients = new Client[20];
    }

    public Transaction(Car[] cars, Client[] clients) {
        this.cars = cars;
        this.clients = clients;
    }

    public void sellCar (Client client, Car car){
        System.out.println("sellCar");
    }

    public void getInfoWarehauseCar(Car[] cars){
        System.out.println("infoWarehauseCar");
    }

    public void getBDClients(Client[] clients){
        System.out.println("BD Clients");
    }

    public Car[] setNewCar(Car car){
        return cars;
    }

    public Client[] setNewClient(Client client) {
        return clients;
    }
}
