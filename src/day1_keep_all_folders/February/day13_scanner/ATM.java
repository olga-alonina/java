package day1_keep_all_folders.February.day13_scanner;

import java.util.Scanner;

public class ATM {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the ATM\n Please enter your card and type pin code ");
    int pin_code = input.nextInt();
    int expected_PIN = 5696;
    if(pin_code==expected_PIN){
        System.out.println("loged in");
        System.out.println("Select a number");
        System.out.println("1)Check balance");
        System.out.println("2)Withdraw");
        System.out.println("3)Deposit");
        int option =  input.nextInt();

        if(option==1){
            System.out.println("Your balance is "+100_000_000);
                    }
        else if(option==2){
            System.out.println("how much you wanna withdraw? ");
            double money_value= input.nextDouble();
            System.out.println("withdrawing " +money_value);}
            else if(option==3) {
            System.out.println("Please deposit the money ");
        }else {
                System.out.println("Invalid selection. Exiting account");
            }
        }
    else {
        System.out.println("Invalid PIN. Try again");
    }



    }
}
