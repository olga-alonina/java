package day1_keep_all_folders.homework.homeworkFeb16;

import java.util.Scanner;

public class replit {
        public static void main(String[] args) {
            // DO NOT TOUCH BELOW:
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int number1 = input.nextInt();
            System.out.println("Enter second number: ");
            int number2 = input.nextInt();
            System.out.println("Enter third number:");
            int number3 = input.nextInt();
            if (number1 > number2||number2 > number3|| number1<number3) {
                System.out.println("middle number is: " + number2);

            }
            else if (number2 > number1||number1<number3|| number2 < number3) {
                System.out.println("middle number is: " + number1);
            }
            else{
                System.out.println("middle number is: " + number3);
            }
        }}
