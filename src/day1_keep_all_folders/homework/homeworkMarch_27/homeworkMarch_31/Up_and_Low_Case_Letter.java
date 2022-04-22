package day1_keep_all_folders.homework.homeworkMarch_27.homeworkMarch_31;

import java.util.ArrayList;
import java.util.Arrays;

public class Up_and_Low_Case_Letter {
    /*Get Uppercase or Lowercase
Write a program that can extract the uppercase and lowercase
characters from a String and store them into separate ArrayLists of
Characters
Ex:
str = “heLLoWoRlD
list1: {h, e, o, o, l}
list2: {L, L, W, R, D}*/
    public static void main(String[] args) {
        String str = "heLLoWoRlD";
        ArrayList<String> up = new ArrayList<>();
        ArrayList<String> low = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                low.add(String.valueOf(str.charAt(i)));
        }else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                up.add(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("low = " + low);
        System.out.println("up = " + up);


    }
}
