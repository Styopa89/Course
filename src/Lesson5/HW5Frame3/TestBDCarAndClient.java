package Lesson5.HW5Frame3;


import Lesson5.HW5Frame3.ShopCar.Body;
import Lesson5.HW5Frame3.ShopCar.Brand;
import Lesson5.HW5Frame3.ShopCar.Car;


public class TestBDCarAndClient {
    Car car;
    Client client;
    Shop sh;

    public TestBDCarAndClient() {
        sh = new Shop();
        this.addClients();
        this.addCar();
        this.buyManyCars();

    }

    private void addCar(){
        sh.addCar(new Car(Brand.BMW, "ert", Body.MINIBUS, 111, 10));
        sh.addCar(new Car(Brand.LADA, "asd", Body.HATCHBACK, 222, 22));
        sh.addCar(new Car(Brand.MERSEDES, "yui", Body.SEDAN, 333, 33));
        sh.addCar(new Car(Brand.VOLKSWAGEN, "dg", Body.WAGON, 444, 44));
        sh.addCar(new Car(Brand.BMW, "asd", Body.MINIBUS, 555, 55));
        sh.addCar(new Car(Brand.BMW, "gjk", Body.WAGON, 666, 66));
        sh.addCar(new Car(Brand.LEXUS, "cb", Body.SEDAN, 777, 77));
        sh.addCar(new Car(Brand.VOLKSWAGEN, "edc", Body.HATCHBACK, 888, 88));
        sh.addCar(new Car(Brand.LEXUS, "ik,", Body.SEDAN, 999, 111));
        sh.addCar(new Car(Brand.VOLKSWAGEN, "dfg", Body.WAGON, 1111, 222));
        sh.addCar(new Car(Brand.BMW, "ert", Body.MINIBUS, 2222, 333));
        sh.addCar(new Car(Brand.LADA, "ujm", Body.HATCHBACK, 3333, 444));
    }

    private void addClients(){
        sh.addClients(new Client("Ivan","Petrov","0635558889"));
        sh.addClients(new Client("Petr","Ivanov","0635558889"));
        sh.addClients(new Client("alex","Kozlov","0635558889"));
        sh.addClients(new Client("Kolya","Sidorov","0635558889"));
        sh.addClients(new Client("Igor","Pushkin","0635558889"));
        sh.addClients(new Client("Andrey","Kozakin","0635558889"));
        sh.addClients(new Client("Sem","Gulyakin","0635558889"));
        sh.addClients(new Client("proba", "dfdg","0636677f889"));
    }

    private void buyManyCars(){
        sh.buyCar(sh.getClients()[1], sh.getCars()[5], 3);
        sh.buyCar(sh.getClients()[3], sh.getCars()[3], 7);
        sh.newDay(); //2
        sh.buyCar(sh.getClients()[6], sh.getCars()[5], 7);
        sh.buyCar(sh.getClients()[7], sh.getCars()[4], 4);
        sh.buyCar(sh.getClients()[8], sh.getCars()[3], 5);
        sh.buyCar(sh.getClients()[9], sh.getCars()[7],8);
        sh.buyCar(sh.getClients()[10], sh.getCars()[2], 5);
        sh.newDay();//3
        sh.buyCar(sh.getClients()[1], sh.getCars()[5], 0);
        sh.buyCar(sh.getClients()[2], sh.getCars()[4], 0);
        sh.buyCar(sh.getClients()[3], sh.getCars()[3], 0);
        sh.newDay(); //4
        sh.buyCar(sh.getClients()[1], sh.getCars()[5], 3);
        sh.buyCar(sh.getClients()[2], sh.getCars()[4], 5);
        sh.buyCar(sh.getClients()[3], sh.getCars()[3], 1);
        sh.buyCar(sh.getClients()[4], sh.getCars()[7], 5);
        sh.buyCar(sh.getClients()[5], sh.getCars()[2], 4);
        sh.newDay();//5
        sh.buyCar(sh.getClients()[6], sh.getCars()[5], 7);
        sh.buyCar(sh.getClients()[7], sh.getCars()[4], 4);
        sh.buyCar(sh.getClients()[8], sh.getCars()[3], 5);
        sh.buyCar(sh.getClients()[9], sh.getCars()[7],8);
        sh.buyCar(sh.getClients()[10], sh.getCars()[2], 5);
        sh.newDay(); //6
        sh.buyCar(sh.getClients()[1], sh.getCars()[5], 3);
        sh.buyCar(sh.getClients()[4], sh.getCars()[7], 5);
        sh.buyCar(sh.getClients()[5], sh.getCars()[2], 4);
        sh.newDay(); //7
        sh.buyCar(sh.getClients()[6], sh.getCars()[5], 7);
        sh.buyCar(sh.getClients()[7], sh.getCars()[4], 4);
        sh.buyCar(sh.getClients()[8], sh.getCars()[3], 5);
        sh.buyCar(sh.getClients()[9], sh.getCars()[7],8);
        sh.buyCar(sh.getClients()[10], sh.getCars()[2], 5);
        sh.newDay(); //8
        sh.buyCar(sh.getClients()[1], sh.getCars()[5], 10);
        sh.buyCar(sh.getClients()[2], sh.getCars()[4], 3);
        sh.buyCar(sh.getClients()[3], sh.getCars()[3], 5);
        sh.buyCar(sh.getClients()[4], sh.getCars()[7], 6);
        sh.buyCar(sh.getClients()[5], sh.getCars()[2], 30);


    }




    public Shop getSh() {
        return sh;
    }
}
