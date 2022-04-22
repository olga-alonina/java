package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a year");
        int year = input.nextInt();
        System.out.println("This year is " + year);
        boolean isLeapYear = year % 400 == 0;
        boolean isLeapYear2 = year % 4 == 0 || year % 100 == 0;
        boolean total = isLeapYear && isLeapYear2;
        System.out.println("Is this year leap? " + total);

        /*boolean isItLeapYear =((year% 4 == 0)&&!(year% 100 == 0))||((year% 400 == 0)&&!(year% 100 == 0));
        System.out.println("isItLeapYear = " + isItLeapYear);
        */
    }
}