package day1_keep_all_folders.February.day11_If_Statement;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
            System.out.println("What is your balance?");
       double balance = input.nextDouble();
            System.out.println("How much money do you wanna send?");
       double withdraw = input.nextDouble();
       balance-=withdraw;

       if (balance<0){
            System.out.println("You dont have enough money,you have to pay fee = 100$");
           System.out.println("Balance before fee " + balance);
        balance-=100;
            System.out.println("Balance = " +balance );
        }
    }
}



                //Create a double value for the account balance.
        //    Create a double value for how much you want to withdraw
        //
        //    Check the balance after the withdraw
        //        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance
        //
        //    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over


