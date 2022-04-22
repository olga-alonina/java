package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.contains("java")) {
            //place in word
            int num1 = word.indexOf("j");
            if (num1 == 0) {
                System.out.println("true");
            } else if (num1 == 1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
     }
   }
}

