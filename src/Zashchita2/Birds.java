package Zashchita2;

import java.sql.DataTruncation;
import java.util.Arrays;

import javax.swing.text.Position;

public class Birds {

	static int NAME = 0;
	static int AMOUNT = 1;
	static int PRICE = 2;
	static int SOLD = 3;

	public static void main(String[] args) {
		String[][] birds = startArraysBirds();
		String[][] newBirds = { { "eagle", "10", "4", "2" },
				{ "parrot", "20", "10", "0" },
				{ "chicken", "40", "2", "5" },
				{ "turkey", "10", "+8", "3" }, };
		
		
		printArraysBirds(birds);
		birds = deliveryOnWarehouse(birds, newBirds);
		sellBirds(birds, "turkey", 11);
		printArraysBirds(birds);
		sellInfo(birds);
		System.out.println();
		ballanceBirdsInfo(birds);
		System.out.println();
		birtsTypeInfo(birds, "turkey");
		System.out.println();
		lessBirdsInfo(birds, 3);
		
	}

	static String[][] startArraysBirds() {
		String[][] birds = { { "eagle", "5", "5", "1" },
				{ "duck", "2", "4", "15" },
				{ "chicken", "1", "2", "20" }, };
		return birds;
	}

	// add birds
	static String[] createArrayBird( String name, String amt,String price, String sell) {
		System.out.println("Running function Birds");
		String[] bird = { name, amt, price, sell };
		return bird;

	}

	// print
	static void printArraysBirds(String[][] birds) {
		System.out.println("Name, Amount, Price, Sell ");
		for (int i = 0; i < birds.length; i++) {
			System.out.println(Arrays.toString(birds[i]));
		}
	}

	static int searchBird(String[][] birds, String nameBird) {
		int k = -1;
		// Search index bird, if no -> k = -1
		for (int i = 0; i < birds.length; i++) {
			if (birds[i][NAME].equals(nameBird)) {
				k = i;
				break;
			}
		}
		return k;
	}

	static String[][] createNewArray(String[][] birds) {
		String[][] birdsNew = new String[birds.length + 1][birds[0].length];
		for (int i = 0; i < birdsNew.length - 1; i++) {
			birdsNew[i] = Arrays.copyOf(birds[i], (birds[i].length));
		}
		return birdsNew;
	}
	static String[][] changeArraysBirds(String[][] birds, String[] bird) {
		int position = searchBird(birds, bird[NAME]);
		bird = preparationArrayToAdd(birds, bird);
			if (position == - 1) {

					birds = createNewArray(birds);

					position = birds.length - 1;
//					System.out.println(position);
			} 
			birds[position] = Arrays.copyOf(bird, bird.length);
			return birds;
	}
			
			
	static String[] preparationArrayToAdd(String[][] birds, String[] bird) {
			int position = searchBird(birds, bird[NAME]);
			if (position == - 1) {
				bird = preparationToAddNewBird(bird);
				
			} else {
				bird = preparationChangeBird(birds[position], bird);
			}
		
		return bird;
	}
	
	static String[] preparationChangeBird(String[] birdsPosition, String[] bird) {
		for (int i = 1; i < bird.length; i++) {
			if (bird[i].startsWith("-") || bird[i].startsWith("+")) {
				bird[i] = String.valueOf(Integer.valueOf(birdsPosition[i]) +
						 Integer.valueOf(bird[i])); 
			}
		}
		return bird;
	}
	
	static String[] preparationToAddNewBird(String[] bird) {
		for (int i = 1; i < bird.length; i++) {
			if (bird[i].startsWith("-") || bird[i].startsWith("+")) {
				bird[i] = bird[i].substring(1);
			} 			
		}
		bird[SOLD] = "0";
		return bird;
	}
	
	 // Delivery on warehouse
	 static String[][] deliveryOnWarehouse(String[][] oldBirds, String[][] newBirds) {
		 	for (int k = 0; k < newBirds.length; k++) {
//		 		System.out.println();
//		 		printArraysBirds(oldBirds);
//		 		System.out.println();
		 		newBirds[k][AMOUNT] = "+" + newBirds[k][AMOUNT];
		 		oldBirds = changeArraysBirds(oldBirds, newBirds[k]);
		 		}
		return oldBirds;
	 }
	
	 // sell birds
		 public static String[][] sellBirds(String[][] birds,String name, int amt) {
			 System.out.println("Running function sellBirds");
			 int position = searchBird(birds, name);
			 if(position == -1 )	{
				 	System.out.println("You can't sell this bird");
				 	return birds;
			 	}
			 String[] bird = Arrays.copyOf(birds[position], birds[position].length);
			
			 if (Integer.valueOf(bird[AMOUNT]) < amt) {
				 System.out.println("You can't sell so much birds!");
			 		return birds;
				}
			 bird[AMOUNT] = String.valueOf(Integer.valueOf(bird[AMOUNT]) - amt);
			 bird[SOLD] = String.valueOf(Integer.valueOf(bird[SOLD]) + amt);
			 birds = changeArraysBirds(birds, bird);
		 		return birds;
		 }
	
	 // Amount of birds of type
	 static void birtsTypeInfo(String[][] birds, String nameBird) {
		 for (int i = 0; i < birds.length; i++) {
			 	if (nameBird.equals(birds[i][NAME])) {
			 		System.out.println(birds[i][NAME] + " out of warehouse : " + birds[i][AMOUNT]);
			 	}
		 }
	 }
	//
	 // Amount of sold birds
	 static int sellInfo(String[][] birds){
		 int result = 0;
		 for (int i = 0; i < birds.length; i++){
			 result += Integer.valueOf(birds[i][SOLD]);
		 } return result;
	 }
	
	
	 // Amount birds on warehouse
	 static void ballanceBirdsInfo(String[][] birds) {
		 System.out.println("All birds on warehouse");
		 for (int i = 0; i < birds.length; i++) {
			 System.out.println(birds[i][NAME] + " out of warehouse : " + birds[i][AMOUNT]);
		 }
	 }
	 // Amount of birds less < "number
	 static void lessBirdsInfo(String[][] birds, int number) {
		 for (int i = 0; i < birds.length; i ++) {
			 if ( number > Integer.valueOf(birds[i][AMOUNT])) {
				 System.out.println(birds[i][NAME] + " less than a " + number);
			 }
		 }
	 }

}
