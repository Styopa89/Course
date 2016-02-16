package Lesson3;

import java.util.Arrays;

public class Frame9 {

	public static void main(String[] args) {
		int[] data = {-3, 25, 2};
		printArray(data);
		
	}
	static void printArray(int[] data) {
		if (data == null ) {
			System.out.println("null");
			return;
		}
		System.out.print("[");
		if (data.length == 0) {
			System.out.print("]");
			return;
		}
		for (int i = 0; i < data.length - 1; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.print(data[data.length - 1] + "]");
		System.out.println();
	}
}
