package day1_keep_all_folders.March.March23_day34;

import java.util.Scanner;

public class number_Words{
    public static String number_As_Word(int num){
        if(num<1||num>10){
            return num+" is an invalid number";

        }
        String[] words = {"One", "Two", "Three","Four", "Five","" +
                "Six", "Seven", "Eight", "Nine","Ten"};
        return words[num-1];

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(number_As_Word(input.nextInt()));
    }
}
