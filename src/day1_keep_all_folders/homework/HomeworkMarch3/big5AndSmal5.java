package day1_keep_all_folders.homework.HomeworkMarch3;

import java.util.Scanner;

public class big5AndSmal5 {
    public static void main(String[] args) {
        //write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 number");

        int attempt=0;
        int big = 0;
        int small = 0;
        while (attempt < 5) {
            System.out.println("enter number");
            int number = input.nextInt();
            attempt++;

            if (attempt == 1) {
                small = number;

            }
             if (number > big) {
                big = number;
            }
            if (number < small) {
                small = number;
             }}
        if(big==small){
            System.out.println(("Smallest number " + small));
        }else{
            System.out.println("Biggest number " + big);
            System.out.println(("Smallest number " + small));
        }}}






