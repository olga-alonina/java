package day1_keep_all_folders.February.day15_switch_statement;

import java.util.Scanner;

public class schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is today?");
        String day = input.next();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
                System.out.println("Java class starts at 19.00 till 22.00");
                break;
            case "Thursday":
                System.out.println("Soft skill class starts at 19.00 till 22.00");
                break;
            case "Friday":
                System.out.println("Does not have class");
                break;
            case "Satarday":
            case "Sunday":
                System.out.println("Java class starts at 10.00 till 17.00");
                break;
            default:
                System.out.println("Invalid writing");
        }

    }
}

