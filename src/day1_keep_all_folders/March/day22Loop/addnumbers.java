package day1_keep_all_folders.March.day22Loop;

import java.util.Scanner;

public class addnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int total = 0;

        while(number <= 5){

            System.out.println("Enter number " + number);
            number++;
            total += input.nextInt();

        }

        System.out.println(total);

}}
