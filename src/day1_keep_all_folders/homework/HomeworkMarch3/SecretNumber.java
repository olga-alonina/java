package day1_keep_all_folders.homework.HomeworkMarch3;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sec = 55;
        int numberOfTry = 1;
        System.out.println("Could you guess a number?");
        int cl = input.nextInt();

        while (cl != sec) {
            if (cl > sec) {
                System.out.println("Too high");
            } else {
                System.out.println("too low");
            }
            System.out.println("Could you guess a number?");
            cl = input.nextInt();
            numberOfTry++;
        }
        System.out.println("You guessed right");
        System.out.println("Number of try " + numberOfTry);
    }
}