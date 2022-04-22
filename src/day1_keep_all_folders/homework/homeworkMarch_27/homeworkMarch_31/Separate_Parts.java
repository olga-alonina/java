package day1_keep_all_folders.homework.homeworkMarch_27.homeworkMarch_31;

import java.util.ArrayList;

public class Separate_Parts {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<String> up = new ArrayList<>();
        ArrayList<String> low = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> sp_Char = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                low.add(String.valueOf(str.charAt(i)));
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                up.add(String.valueOf(str.charAt(i)));
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numbers.add(String.valueOf(str.charAt(i)));
            } else {
                sp_Char.add(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("low = " + low);
        System.out.println("up = " + up);
        System.out.println("numbers = " + numbers);
        System.out.println("sp_Char = " + sp_Char);
    }
}

