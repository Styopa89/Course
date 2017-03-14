package lesson6.Frame10;


public class MyPersonalException extends RuntimeException {

    public static void main(String[] args) {
       try {
//           MyPersonalException.format();
           MyPersonalException.argument();
           System.out.println("This good!");
       } catch (NumberFormatException e) {
           System.out.println("this NumberFormatException");
       } catch (IllegalArgumentException e) {
           System.out.println("this IllegalArgumentException");
       } catch (RuntimeException e) {
           System.out.println("this InterruptedException");
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           System.out.println("this finally");
       }

    }
    public static void format() throws RuntimeException, InterruptedException {
        long i = -2;
        Thread.sleep(i);
    }

    public static void argument() {
        int a = Integer.valueOf("a");
    }

}
