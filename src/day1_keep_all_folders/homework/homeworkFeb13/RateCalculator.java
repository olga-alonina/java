package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("please enter a salary");
        double salary = input.nextDouble();
            System.out.println("salary = " + salary);

            System.out.println("How many hours worker worhks in a week?");
        int hours_per_week = input.nextInt();
            System.out.println("his/her hours is = " + hours_per_week);

        double hourly_Rate = salary / (hours_per_week * 52);
        System.out.println("Salary will be " + hourly_Rate);

    /*write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)*/
}
}
