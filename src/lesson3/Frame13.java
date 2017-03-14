package lesson3;

public class Frame13 {

	public static void main(String[] args) {
		int[] data = {1};
		
		System.out.println(oddElementSum(data));
	}
	static long oddElementSum(int[] data) {
		if (data == null || data.length < 2) {
			return -1;
		}
		int  sum = 0;
		for (int i = 1; i < data.length; i +=2) {
			sum += data[i];
		}
		return sum;
	}

}
