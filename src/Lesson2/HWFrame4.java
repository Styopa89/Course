package Lesson2;

public class HWFrame4 {

	public static void main(String[] args) {
		start(0);
		start(10);
		start(-10);

	}
	static void start(int a) {
		if (a >= 0){
		while (a > 0) {
			System.out.println(a--);
		}
		System.out.println("Go!");
	} else {
		System.out.println("Start failed!!");
		}
	}
}
