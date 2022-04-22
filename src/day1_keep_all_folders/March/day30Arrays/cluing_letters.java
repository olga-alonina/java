package day1_keep_all_folders.March.day30Arrays;

import java.util.Arrays;

public class cluing_letters {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a'};

        String word = "java";

        // converting a String to a char []

        char[] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

         // print every letter in my String

        for (char eachChar : java) {  //  for(char eachChar : word.toCharArray()){
            System.out.print(eachChar);
        }
        System.out.println();
        System.out.println("**************");
        System.out.println(java[0]);
    }
}