package day1_keep_all_folders.homework.homeworkFeb15;

import java.util.Scanner;

public class daysPerMonths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int month = scan.nextInt();


        if (month == 1 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {System.out.print("This month has 31 days");}

        if (month == 4 || month == 6 || month == 9 || month == 11)
            {System.out.println("This month has 30 days");}
        if (month == 2)
            {System.out.println("This month has 28 days");}

            //create a int variable to represent the month number, where 1 is Janurary
            //and 12 is Decemeber.
            //use the month number input to determine how many days are in that month.
            //use the following data to help you determine the number of days in each
            //month:
            //Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
            //Months that has 30 days: 4, 6, 9, 11
            //Month that has 28 days: 2
            //ex:
            //12
            //31 days
            //ex:
            //9
            //30 days
        }
    }


