package Lesson3;

import java.util.Arrays;

public class Frame1617 {

	public static void main(String[] args) {
		int[] data = {4, 2, 3, 4, 5};
		System.out.println(Arrays.toString(data));
		swap(data);
	}
	static void swap(int[] data){
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] > data[i + 1]){
				int temp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = temp;
			}
			System.out.println(Arrays.toString(data));
		}
	}
}
