package day1_keep_all_folders.March.March20_day33;

import java.util.Scanner;

public class Age {
    public static void Age(int born_year) {
        int result = 2022 - born_year;
        System.out.println("result = " + result);
    }


    public static void main(String[] args) {
        Age(1988);//or=>
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday year");
        Age(input.nextInt());
    }
}
