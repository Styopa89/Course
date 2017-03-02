package lesson9.adapter.math.v2.calc;

import lesson9.adapter.math.Arifmetika;

public class DefaultCalculator implements Calculator {


	public int summa(int a, int b) {
		int [] i = {a, b};
		return Arifmetika.summa(i);
	}

	public int multiply(int a, int b) {
		return Arifmetika.multiply(a,b);
	}
}
