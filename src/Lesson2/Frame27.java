package Lesson2;

public class Frame27 {

	public static void main(String[] args) {
		System.out.println(getQuadrant("a", "1"));
		System.out.println(getQuadrant("a", "2"));
		System.out.println(getQuadrant("b", "2"));
		System.out.println(getQuadrant("i", "9"));
		printCoordinates("a", "1");
		printCoordinates("a", "2");
		printCoordinates("b", "2");
		printCoordinates("i", "9");
	}
	
	static void printCoordinates(String v, String h) {
		String coordinateXY = getQuadrant(v, h);
		String x = coordinateXY.substring(0, coordinateXY.indexOf("_"));
		String y = coordinateXY.substring(coordinateXY.indexOf("_") + 1);
		System.out.println(v + h + ":(" + x + "px; " + y + "px)" );
	}
	
	static String getQuadrant(String v, String h) {
		String y = "abcdefghi";
		String x = "123456789";
		return x.indexOf(h)*64 + "_" + y.indexOf(v)*64;
		
	}
}
