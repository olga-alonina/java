package day1_keep_all_folders.March.day18;

import java.util.Scanner;

public class fulter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter message");
        String message = input.nextLine();
        message = message.toLowerCase();
        message = message.trim();

        boolean hasBadWord = message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying");

        if (hasBadWord) {
            System.out.println("message failed to send");
        } else {
            System.out.println("message sent");
        }


    }
}
