package Lesson5.Frame3;

public class Launcher {
    public static void main(String[] args) {
        Tank tank = new Tank();
        T34 t34 = new T34();
        BT7 bt7 = new BT7();
        Tiger tiger = new Tiger();

//        tank.printInfo();
        t34.printInfo();
        bt7.printInfo();
        tiger.printInfo();
        bt7.move();
        t34.move();
        System.out.println(t34);

    }
}
