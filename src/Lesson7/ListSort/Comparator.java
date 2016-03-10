package Lesson7.ListSort;


public class Comparator implements java.util.Comparator {

    private String alphabet = "abcdefghijklmnopqrstuvwxyz";


    @Override
    public int compare(Object o1, Object o2) {

        String str1 = (String) o1;
        String str2 = (String) o2;
        for (int i = 0; i <= str1.length() && i <= str2.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            int intCh1 = alphabet.indexOf(ch1);
            int intCh2 = alphabet.indexOf(ch2);
            if (intCh1 < intCh2){
                return 1;
            } else if (intCh1 > intCh2) {
                return -1;
            }
        }
        return 0;
    }
}
