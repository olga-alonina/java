package day1_keep_all_folders.homework.homeworkApril_4;

import java.util.ArrayList;

public class All_Palindrome {
    public static ArrayList<String> all_Palindrome(String[] input) {
        ArrayList<String> new_Palindrome = new ArrayList<>();
        for (String word : input) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {

                reverse += word.charAt( i );
            }
            if (word.equalsIgnoreCase( reverse )) {
                new_Palindrome.add( word );
            }
        }
        return new_Palindrome;
    }

    public static void main(String[] args) {
        String[] input = {"Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"};
        System.out.println( all_Palindrome( input ) );
    }
}
