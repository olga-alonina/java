package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class Divisiable_2_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt();
        System.out.println("number = " + number);
        boolean div_by_2 = 0 == number % 2;
        boolean div_by_3 = 0 == number % 3;
        boolean div_by_5 = 0 == number % 5;

        System.out.println(number + " is divisible by 2:" + div_by_2);
        System.out.println(number + " is divisible by 3:" + div_by_3);
        System.out.println(number + " is divisible by 5:" + div_by_5);

    }
}
