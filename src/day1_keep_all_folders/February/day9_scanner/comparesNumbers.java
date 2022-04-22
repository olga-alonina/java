package day1_keep_all_folders.February.day9_scanner;

import java.util.Scanner;

public class comparesNumbers {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                System.out.println("Write first number:");
            int number = input.nextInt();
                System.out.println("number = " + number);
                System.out.println("Write second number:");
            int number2 = input.nextInt();
                System.out.println("number2 = " + number);
                boolean areTheyEqual = number==number2;
        System.out.println("Are they equal? " + areTheyEqual);

        /*  create a Scanner object
        ask the user to enter 2 numbers
        check if the numbers are equal to each other*/
    }
}
