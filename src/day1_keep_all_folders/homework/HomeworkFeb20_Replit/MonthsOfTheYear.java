package day1_keep_all_folders.homework.HomeworkFeb20_Replit;

import java.util.Scanner;

public class MonthsOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your number:");
        int number = input.nextInt();

        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid number");

        }
    }
}

