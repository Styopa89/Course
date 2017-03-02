package lesson9.adapter.math.v1.calc;

import lesson9.adapter.math.Arifmetika;

public class Calculator {

	public int summa(int a, int b) {
		return Arifmetika.summa(new int[] {a, b});
	}

	public int multiply(int a, int b) {
		int result = 0;
		for (int i=0; i < b; i++){
			result += a;
		}
		return result;
	}
}
