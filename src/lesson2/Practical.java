package lesson2;

public class Practical {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long i = 0;
			while (true) {
				System.out.println(i++);
				if (System.currentTimeMillis() - time > 1000) {
					break;
				}
			}
	}
	
}
