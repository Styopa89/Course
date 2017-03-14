package lesson3;

import java.util.Arrays;

public class Frame27 {

	public static void main(String[] args) {
		int[] data1 = {1, 2, 3, 2};
		int[] data2 = {3, 2, 1,4};
			System.out.println(Arrays.toString(union(data1, data2)));

	}
	static public int[] union(int[] data1, int[] data2) {
		int[] result = new int[data1.length + data2.length] ;
		for (int i = 0; i < result.length; i++) {
			if (i < data1.length) {
				result[i] = data1[i];
			} else {
				result[i] = data2[i - data1.length];
			}
		}
		return result;
	}

}
