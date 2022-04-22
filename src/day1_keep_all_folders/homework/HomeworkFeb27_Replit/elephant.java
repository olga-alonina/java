package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if (word.length() % 2 == 0) {
            int midChar = word.length() / 2;
            char middle = word.charAt(midChar);
            System.out.println(word.substring((midChar - 1), midChar + 1));
        } else {
            int midChar = word.length() / 2;
            char middle = word.charAt(midChar);
            System.out.println(word.substring((midChar), midChar + 1));
        }
    }
}
