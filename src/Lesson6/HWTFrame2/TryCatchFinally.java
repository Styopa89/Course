package Lesson6.HWTFrame2;


public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Always!");
        }

    }
}
