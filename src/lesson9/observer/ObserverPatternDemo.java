package lesson9.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		System.out.println("Observer Pattern Demo ");
		System.out.println();
		
		ConcreteSubject s = new ConcreteSubject();
		
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();

		s.addObserver(o1);
		s.addObserver(o2);

		for (int i = 0; i < 10; i++) {
			s.doTheJob();
			System.out.println();
		}
		
		s.removeObserver(o2);

		for (int i = 0; i < 10; i++) {
			s.doTheJob();
		}
	}

}
