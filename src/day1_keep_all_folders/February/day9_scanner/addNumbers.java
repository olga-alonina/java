package day1_keep_all_folders.February.day9_scanner;

import java.util.Scanner;

public class addNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write first number:");
        int number = input.nextInt();
        System.out.println("number = " + number);
        System.out.println("Write second number:");
        int number2 = input.nextInt();
        System.out.println("number2 = " + number2);
        System.out.println("Write third number:");
        int number3 = input.nextInt();
        System.out.println("number3 = " + number3);
        int sum = number + number2 + number3;
        System.out.println("Sum = " + sum);

    }
}
