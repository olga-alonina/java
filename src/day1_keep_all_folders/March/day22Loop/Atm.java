package day1_keep_all_folders.March.day22Loop;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        int valiblePin = 1234;
        int userPin;
        int attempts=0;
        do{
            System.out.println("Enter your PIN");
             userPin  = input.nextInt();
             attempts++;
        } while (attempts<3&&valiblePin != userPin);
        if(valiblePin==userPin){
            System.out.println("Logged in");
        }else {
            System.out.println("Locked out");
        }
    }
}
