package lesson2;

public class Frame6 {

	public static void main(String[] args) {
		
		System.out.println(square(5));
		System.out.println(square(15.0));
		System.out.println(square(25.0));
		System.out.println(square(35));

	}
	static int square(int a) {
		System.out.println("int");
		return a * a;
		
	}
	
	static double square(double a) {
		System.out.println("double");
		return a * a;
	}

}
