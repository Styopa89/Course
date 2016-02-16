package Lesson4;

public class GreetingService {

	public static void main(String[] args) {
		if (args != null && args.length > 0) {	
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Exampl:  java GreetingService Victor");
		}

	}

}
