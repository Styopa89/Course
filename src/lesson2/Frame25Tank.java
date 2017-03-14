package lesson2;

public class Frame25Tank {

	public static void main(String[] args) {
		System.out.println(getQuadrant("a", "1"));
		System.out.println(getQuadrant("a", "2"));
		System.out.println(getQuadrant("b", "2"));
		System.out.println(getQuadrant("i", "9"));
		

	}
	
	static String getQuadrant(String v, String h) {
		String y = "abcdefghi";
		String x = "123456789";
		return x.indexOf(h)*64 + "_" + y.indexOf(v)*64;
		
	}

}
