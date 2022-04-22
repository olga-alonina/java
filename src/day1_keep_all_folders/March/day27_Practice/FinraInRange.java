package day1_keep_all_folders.March.day27_Practice;

import java.util.Scanner;

public class FinraInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your range");
        int range = input.nextInt();

        for (int i = 1; i <= range; i++) {
            String newone = "";
            if (i % 3 == 0) {
                newone += "Fin";
            }
            if (i % 5 == 0) {
                newone += "Ra";
            }
            System.out.print(newone.isEmpty()?i+" ":newone+" ");

        }
    }
}