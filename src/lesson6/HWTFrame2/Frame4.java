package lesson6.HWTFrame2;


public class Frame4 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new Exception();

        } catch (Exception e) {
            System.out.println("catch");
            throw new IllegalStateException();

        } finally {
            System.out.println("I want to be printed");
        }
    }
}
