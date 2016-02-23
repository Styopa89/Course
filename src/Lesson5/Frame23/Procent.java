package Lesson5.Frame23;


public class Procent {

    private int monthlyPayment;
    private int interest;
    private int dreamSum;
    public static void main(String[] args) {
        int mounth;
        mounth = darkZone(100, 12, 1000000);
        System.out.println(mounth);
        System.out.println("you dream sum on balance : " + (mounth / 12) + " years, " + (mounth % 12) + " mounth");
    }

    public static int darkZone(int monthlyPayment,int interest, int dreamSum ) {
        int ballance = 0;
        int counter = 0;
        while (ballance < dreamSum) {
            ballance += monthlyPayment;
            ballance +=  (interest * ballance) / 1200;
            System.out.println(ballance);
            counter++;
        }
        return counter;
    }
}
