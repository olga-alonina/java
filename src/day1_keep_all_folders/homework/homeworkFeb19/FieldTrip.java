package day1_keep_all_folders.homework.homeworkFeb19;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your school goes on a Field trip each year");
        System.out.println("What grade are you? ");
        int grade = input.nextInt();

        switch (grade){
            case 1:
                System.out.println("location -  Apple orchard\n" +
                        "number of groups - 3\n" +
                        "teacher in charge - Ms. Smith");
            case 2:
                System.out.println("location - Zoo\n" +
                        "number of groups - 7\n" +
                        "teacher in charge - Mr. Lee");
            case 3:
                System.out.println("location - Aquarium\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Wilson");
            case 4:
                System.out.println("location - Movie theater\n" +
                        "number of groups - 2\n" +
                        "teacher in charge - Ms. Reyes");
            case 5:
                System.out.println("location - Museum\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Lela");
            case 6:
                System.out.println("location - Six Flags\n" +
                        "number of groups - 8\n" +
                        "teacher in charge - Mr. Watt");
            default:
                System.out.println("Invalid Number");
        }
}}

