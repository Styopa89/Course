package Lesson3;
 
import java.util.Arrays;
 
public class Practical {
 
	public static void main(String[] args) {
		String [][] n1 = {{""}, {}, null};
		for (int i = 0; i < n1.length; i++){
		if(n1[i] == null){
				System.out.println("null");
				System.out.println();
		} else if (n1[i].length == 0) {
			System.out.println("n1[" + i + "].length == 0");
			System.out.println(Arrays.toString(n1[i]));
			System.out.println();
		} else {
			System.out.println("n1[" + i + "].length == " + n1[i].length);
			System.out.println(Arrays.toString(n1[i]));
			System.out.println();
		}
		}
	}
 
}