package lesson2;

public class Frame19 {

	public static void main(String[] args) {
		System.out.println(min(100,200,300));
		System.out.println(min(100,20,300));
		System.out.println(min(100,200,30));
		System.out.println(min(100,200,300));
	}
	static int min (int a, int b,int c ) {
		if (a > b) {
			if (b > c) {
				return c;
			} 
		} else if (b > c) {
			return c;
		} 
		return b;
	}
	
	
//	static int min(int a, int b, int c) {
//		int result = a;
//		if (b < result) {
//			result = b;
//		}
//		if (c < result) {
//			result = c;
//		}
//		return result;
//	}
	
}
