package day1_keep_all_folders.Mary;

public class tes {
    public static void main(String[] args) {
        String one = "neverGiveUp";
        //            01234567890
        String one1 ="";
        String two = "";
        String three = "";
        String result = "";
        for (int i = 0; i < one.length(); ++i) {
            if (one.charAt(i) == 'G') {
              one1+= one.substring(0, one.indexOf('G'));
                System.out.println("One1 = " + one1);
            }
            if (one.charAt(i) == 'U') {
                two += one.substring(one.indexOf('G'), one.indexOf('U'));
                System.out.println("two = " + two);
            } if (one.charAt(i) == 'p') {
                three += one.substring(one.indexOf('p')-1, one.length());
                System.out.println("three = "+three);
            }
        }
    }
}