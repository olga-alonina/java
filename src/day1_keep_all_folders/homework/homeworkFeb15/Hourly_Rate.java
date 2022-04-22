package day1_keep_all_folders.homework.homeworkFeb15;

import java.util.Scanner;

public class Hourly_Rate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hourly rate: ");
        double rate1 = input.nextDouble();
        double rate2;

        System.out.println("How many hours do you worked?");
        double number_of_hours_worked = input.nextDouble();
        double net_pay = rate1 * number_of_hours_worked;

        if (number_of_hours_worked > 40) {
            rate2 = rate1 * 1.5;
            net_pay = (rate1*40)+(rate2*(number_of_hours_worked-40));//40*10+(15*3) = 400+45
        }
        System.out.println("net_pay = " + net_pay);

    }
}