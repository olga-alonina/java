package day1_keep_all_folders.March.day24_Different_Loop;

import java.util.Scanner;

public class Anagramm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 word to check:");
        String word = input.nextLine();
        String anagram = input.nextLine();
        String result="";

        for (int i = 0; i < word.length(); i++) {
            if (anagram.contains("" + word.charAt(i))) {
                result = "Its anagram";
            } else {
                result = "false";
            }
        }
        System.out.println(result);

    }
}
