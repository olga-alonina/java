package day1_keep_all_folders.homework.homeworkFeb19;

import java.util.Scanner;

public class army {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you eligible for army ?");
        System.out.println("Are you citizen? ");
        boolean citizenship = input.nextBoolean();
        System.out.println("Are you resident? ");
        boolean resident = input.nextBoolean();
        System.out.println("Do you have HS Diploma? ");
        boolean high_school_diploma = input.nextBoolean();
        System.out.println("How old are you? ");
        int age = input.nextInt();

        if (((citizenship || resident)) && ((age >= 18 && age <= 35)) && ((high_school_diploma))) {
            System.out.println("You are qualified for the Army");
        } else {
            if (!citizenship && !resident) {
            System.out.println("You must be a citizen or a resident");
        }
        else if (age <= 18 || age >= 35) {
            System.out.println("Your age must be between 18 to 35 years old");
        }

        if (!high_school_diploma) {
            System.out.println("You must have a high school diploma");
        }

    }
}}
