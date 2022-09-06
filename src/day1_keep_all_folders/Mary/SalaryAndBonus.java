package day1_keep_all_folders.Mary;

import java.util.Scanner;

public class SalaryAndBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a salary:");
        double salary = input.nextDouble();
        System.out.println("Please enter a bonus:");
        double bonus = input.nextDouble();
        double min_salary = 3000;
        double min_bonus = 100;
        String result;

        if(salary>=min_salary||bonus>=min_bonus){
            result = "OK";}

        else {
            result = "Too low";
        }
        System.out.println("Long result "+result);
        System.out.println("*********");
        String result2 = (salary>=min_salary||bonus>=min_bonus)?"Ok":"Too low";
        System.out.println("Short result "+result2);

    }
}
