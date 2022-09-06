package day1_keep_all_folders.Mary;

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word:");
        char nextWord = input.next().charAt(0);


        if (nextWord < 'P') {
            System.out.println("First half of the alphabet");
        }
        else{
            System.out.println("Second part of the alphabet");
        }
    }}

