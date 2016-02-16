package Lesson3;

public class Frame6 {

	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4};
		
		System.out.println(getLast(data));
		
		
		

	}
	static int getLast(int[] data) {
		if (data.length > 0 && data != null) {
			return data[data.length - 1];
		}
		return -1;
	}

}
