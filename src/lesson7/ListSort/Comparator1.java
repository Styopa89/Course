package lesson7.ListSort;

import java.util.Comparator;

public class Comparator1 implements Comparator<Object>{
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = (String) o1;
        String str2 = (String) o2;
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0){
            return 1;
        }else if (result > 0 ){
            return -1;
        }
        return 0;
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        String str1 = (String) o1;
//        String str2 = (String) o2;
//        for (int i = 0; i <= str1.length() && i <= str2.length(); i++) {
//            char ch1 = str1.charAt(i);
//            char ch2 = str2.charAt(i);
//            int intCh1 = alphabet.indexOf(ch1);
//            int intCh2 = alphabet.indexOf(ch2);
//            if (intCh1 < intCh2){
//                return 1;
//            } else if (intCh1 > intCh2) {
//                return -1;
//            }
//        }
//        return 0;
//    }
}
