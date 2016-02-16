package Lesson3;

import java.util.Arrays;

public class Frame8 {

	public static void main(String[] args) {
		int[] data = {10, -3, 25, 4};
		
		swap(data, 1, 3);
		System.out.println(Arrays.toString(data));

	}
	static void swap(int[] data, int i, int k) {
		if(data != null && i >=0 && k >= 0 && i < data.length && k < data.length) {
			System.out.println("i: " + data[i] + ", k: " + data[k]);
			int temp = data[i];
			data[i] = data[k];
			data[k] = temp;
			System.out.println("i: " + data[i] + ", k: " + data[k]);
		}
	}
}
