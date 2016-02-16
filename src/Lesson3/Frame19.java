package Lesson3;

import java.util.Arrays;

public class Frame19 {

	public static void main(String[] args) {
		int[] data = {10, 9, 8, 7, 6, 5};
//		int[] data = {4, 2, 3, 4, 5, -15, -3, 100};
		System.out.println(Arrays.toString(data));
		sort(data);
	}
	static void sort(int[] data){
		if(data == null || data.length < 0) {
			return;
		}
		for (int j = 0; j < data.length - 1 ; j++) {
		for (int i = 0; i < data.length - 1 - j; i++) {
			if (data[i] > data[i + 1]){
				int temp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = temp;
			}
			System.out.println(Arrays.toString(data));
		}
	}
	}

}
