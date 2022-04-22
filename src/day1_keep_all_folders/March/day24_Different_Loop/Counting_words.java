package day1_keep_all_folders.March.day24_Different_Loop;

import java.util.Scanner;

public class Counting_words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor sentence");
        String sent = input.nextLine().trim();
        int space = 0;

        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == ' ') {
                space++;
            }

        }System.out.println("Coutaty " + (space+1));
    }
}
