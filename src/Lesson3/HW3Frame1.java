package Lesson3;

public class HW3Frame1 {

	public static void main(String[] args) {
		double[] numbers = {3.5, 2, 4.6, 5.5, 3.5};
		System.out.println(fineElement(numbers, 2));
		System.out.println(fineElement(numbers, 3.5));
		System.out.println(fineElement(null, 0));
		
		
	}
	
	static public int fineElement(double[] numbers, double el){
		if (numbers != null){
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == el){
				return i;				
				}
			}
		}
		return -1;
	}

}
