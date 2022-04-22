package day1_keep_all_folders.February.day15_switch_statement;

import java.util.Scanner;

public class DayinWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number");
        int DayNumber = input.nextInt();

        switch (DayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("Nadir's day");
                break;
            case 6:
                System.out.println("Satarday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}

