package lesson3;

import java.util.Arrays;

public class Frame26 {

	public static void main(String[] args) {
		String[][] country = {
				{"China", "Peking", "1254040000"},
				{"India", "New Delhi", "1210569573"},
				{"USA", "Washington D.C.", "316305000"},
				{"Indonesia", "Jakarta", "237641326"},
				{"Brazil", "Brasilia", "193946886"},
				{"Pakistan", "Islamabad", "183748000"}
		};
		System.out.println(getPopulation(country));
		
		
		}
	public static long getPopulation(String[][] data) {
		long population = 0;
		for (int i = 0; i < data.length; i++ ){
			population += Long.parseLong(data[i][2]);
			System.out.println(Arrays.toString(data[i]));
		}
		return population;
	}
	

}
