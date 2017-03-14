package lesson2;

public class Frame23 {

	public static void main(String[] args) {
		System.out.println(isSpring(3));
		System.out.println(isSpring(8));
		System.out.println(isSpring(20));
		System.out.println(isSpring(-3));

	}
	
	static int isSpring(int month) {
		int result = -1;
		if (month >= 1 && month <= 12) {
			if (month >= 3 && month <= 5) {
				result = 1;
			} else {
				result = 0;
			}
		}
		return result;
	}

}
