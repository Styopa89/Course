package Lesson2;

public class Frame17 {

	public static void main(String[] args) {
		System.out.println(oldEnough(20));
		System.out.println(oldEnough(22));
	}
	static boolean oldEnough(int age) {
		if (age >= 21){
			return true;
		}
		return false;
	}

}
