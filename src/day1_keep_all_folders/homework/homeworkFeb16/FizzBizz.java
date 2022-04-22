package day1_keep_all_folders.homework.homeworkFeb16;

import java.util.Scanner;

public class FizzBizz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number");

        int number = input.nextInt();
        if (number%3==0&&number%5!=0){
            System.out.println("Fizz");}
            else if (number%5==0&&number%3!=0){
                System.out.println("Buzz");}
                else if (number%5==0&&number%3==0){
                    System.out.println("FizzBuzz");}
                    else
                    {
                        System.out.println(number);}}}

