package day1_keep_all_folders.homework.homeworkMarch_27.homeworkMarch_31;

import java.util.ArrayList;
import java.util.Arrays;

public class Switch_parts {
    public static ArrayList<String>switch_In_Pairs(ArrayList<String>words) {
        for(int i = 0; i < words.size(); i += 2){
            String temp = words.get(i);
            words.set(i, words.get(i + 1));
            words.set(i + 1, temp);
        }

        return (words);
    }
   public static String switch_parts(String[] arr) {

        String[] switchArr = new String[arr.length];
        for (int i = 0; i < arr.length / 2; i++) {
            switchArr[i] = arr[i + 2];
        }
        for (int j = arr.length - 1; j >= arr.length / 2; j--) {
            switchArr[j] = arr[j - 2];
        }
        return Arrays.toString( switchArr );
    }



    public static void main(String[] args) {
       String[] arr = {"Cat", "in", "the", "hat"};
        System.out.println( switch_parts( arr ) );
        ArrayList<String> list = new ArrayList<>(Arrays.asList( "Cat", "in", "the", "hat" ));
        System.out.println(switch_In_Pairs(list));

    }
}


