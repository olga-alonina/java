package day1_keep_all_folders.homework.homeworkFeb19;

import java.util.Scanner;

public class Age_Group {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();

        if (age <= 0 && age > 120) {
            System.out.println("Invalid age");

            /*
             if (age < 0 || age > 120) {
                System.out.println("Invalid age");
            if (age <0) {
                System.out.println("Invalid age");}
             else if(age>120){
                    System.out.println("Invalid age")
                }*/
        }
        if (age > 0 && age <= 2) {
            System.out.println("Baby");
        } else if (age >= 3 && age <= 5) {
            System.out.println("Toddler");
        } else if (age >= 6 && age <= 9) {
            System.out.println("Kid");
        } else if (age >= 10 && age <= 12) {
            System.out.println("Pre-Teen");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 20) {
            System.out.println("Young Adult");
        } else if (age >= 21 && age <= 35) {
            System.out.println("Adult");
        } else if (age >= 36 && age <= 55) {
            System.out.println("Middle-Aged Adult");
        } else if (age > 55) {
            System.out.println("Senior Citizen");


        }

    }
}
//declare and assign an age variable
//
//use these ranges to determine which age group  you belong to
//
//	if the given age value is less than 0 or more than 120:
//		print: Invalid age
//
//	otherwise uses these to determine the age group

//		Teenager (13 - 17)
//		Young Adult (18 - 20)
//		Adult (21 - 35)
//		Middle-Aged Adult (36 - 55)
//		Senior Citizen (55+)