package Zashchita2;

public class Zadacha {

	public static void main(String[] args) {
		String str = "I want to learn Java!";
		str = " " + str + " ";
		char[] chArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chArray[i] = str.charAt(i);
		}
		int start = 0;
		int end = 0;
		for (int i = 0; i < chArray.length; i++) {
			if (chArray[i] == ' ') {
				end = i;
//				System.out.println(start);
//				System.out.println(end);
//				System.out.println();
				chArray = changeWord(chArray, start, end);
				start = i;
				
			}
		}
		str += "   ";
		for (int i = 0; i < chArray.length; i++) {
			str += chArray[i];
		}
		System.out.println(str);
		
		
	}
	static public char[] changeWord(char[] ch, int start, int end) {
		char changeCh = ' ';
		for (int i = 0; i <= ((end - start) / 2); i++ ) {
			changeCh = ch[start + i];
			ch[start + i] = ch[end - i];
			ch[end - i] = changeCh;
		}
		return ch;
	}
	
}
