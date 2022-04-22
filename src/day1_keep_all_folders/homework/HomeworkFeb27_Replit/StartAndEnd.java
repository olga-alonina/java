package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

public class StartAndEnd {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        if (word.startsWith("x") || word.startsWith("X")) {
            word = word.substring(1);
        }
        if (word.endsWith("x") || word.endsWith("X")) {
            word = word.substring(0, word.length() - 1);
            System.out.println(word);
        } else {
            System.out.println(word);

        }
    }
}



