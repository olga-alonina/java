package day1_keep_all_folders.March.March20_day33;

import java.util.Scanner;

public class count_Numbers {
    public static void counter(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter stop number");
        int number = input.nextInt();
        counter(number);
    }
}
