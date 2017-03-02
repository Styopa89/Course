package lesson9.adapter.math.v2;

import java.util.Random;
import lesson9.adapter.math.v2.calc.Calculator;
import lesson9.adapter.math.v2.calc.DefaultCalculator;

public class Launcher {

	public static void main(String[] args) {
		Calculator calc = new DefaultCalculator();
		
		Operations o = new Operations();
		o.setCalc(calc);

		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(o.createSummaryReport(i));//r.nextInt(100)));
		}
	}
}
