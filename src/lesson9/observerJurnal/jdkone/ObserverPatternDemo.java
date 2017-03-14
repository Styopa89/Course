package lesson9.observerJurnal.jdkone;

import java.util.Observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		System.out.println("Observer Pattern Demo ");
		System.out.println();
		
		Worker s = new Worker();
		
		Observer o1 = new Supervisor();
		Observer o2 = new Supervisor();

		s.addObserver(o1);
		s.addObserver(o2);

		for (int i = 0; i < 10; i++) {
			s.doRegularJob();
			System.out.println();
		}
		
		s.deleteObserver(o2);

		for (int i = 0; i < 10; i++) {
			s.doSpecificJob();
			System.out.println();
		}
	}

}
