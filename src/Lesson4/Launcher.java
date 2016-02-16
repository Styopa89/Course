package Lesson4;

public class Launcher {

	public static void main(String[] args) {
		Tank[] t = new Tank[5];
		for (int i = 0; i< t.length; i++) {
			t[i] = new Tank();
			t[i].setColor("red" + i);
			t[i].setCrew(10*i);
			t[i].setMaxSpeed(100*i);
		}
		printTankInfo(t);
		
//		System.out.println("Tank [color: " + t.getColor() + ", crew: " + t.getCrew() + ", maxSpeed: " + t.getMaxSpeed() + "]");
//		Tank t2 = new Tank("red");
//		System.out.println("Tank [color: " + t2.getColor() + ", crew: " + t2.getCrew() + ", maxSpeed: " + t2.getMaxSpeed() + "]");
//		Tank t3 = new Tank("green", 5, 300);
//		System.out.println("Tank [color: " + t3.getColor() + ", crew: " + t3.getCrew() + ", maxSpeed: " + t3.getMaxSpeed() + "]");

	}
	public static void printTankInfo (Tank[] t) {
		for (int i = 0; i< t.length; i++) {
//			System.out.println("Tank [color: " + t[i].getColor() + ", crew: " + t[i].getCrew() + ", maxSpeed: " + t[i].getMaxSpeed() + "]");
		}
	}

}
