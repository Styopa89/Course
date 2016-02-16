package Lesson3;

public class Frame15 {

	public static void main(String[] args) {
		int[] data = {19, 5, 10, 4, 6};
		System.out.println(avarage(data));
	}
	static double avarage(int[] data) {
		double sum = 0;
		for(int i : data){
			sum += i;
			System.out.println(sum);
		}
		return sum / data.length;
	}

}
