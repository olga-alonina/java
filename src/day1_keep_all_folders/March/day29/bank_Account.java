package day1_keep_all_folders.March.day29;

import java.util.Arrays;
import java.util.Scanner;

public class bank_Account {
    public static void main(String[] args) {
        String[] bank_account = {"Olga Alonina", "cheking", "18041988", "30,000"};
        System.out.println("bank_account= " + bank_account.length);
        System.out.println("Name " + bank_account[0]);
        System.out.println("account type " + bank_account[1]);
        System.out.println("account number " + bank_account[2]);
        System.out.println("balance " + bank_account[3]);
        System.out.println(Arrays.toString(bank_account));
        System.out.println("************************************");
        String [] bank_account2 = new String[4];
        System.out.println(Arrays.toString(bank_account2));
        bank_account2[0] = "Jamie Fox";
        bank_account2[1] = "Savings";
        bank_account2[2] = "130484192";
        bank_account2[3] = "10203324";
        System.out.println(Arrays.toString(bank_account2));
        System.out.println("************************************");
        String[] bank_account3 = new String[4];
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter your full name");
        String fullName = input.nextLine();
        //bank_account3[0] = fullName;
        System.out.println("Enter your account type");
        bank_account3[1] = input.nextLine();
        System.out.println("Enter your account number");
        bank_account3[2] = input.nextLine();
        System.out.println("Enter your balance");
        bank_account3[3] = input.nextLine();
        System.out.println(Arrays.toString(bank_account3));*/

        System.out.println("************************************");
        String[] bank_account4 = new String[4];
        String[] questions = {"full name", "account type", "account number", "balance"};
        for (int i = 0; i < bank_account4.length; i++) {
            System.out.println("Enter your " + questions[i]);
            bank_account4[i] = input.nextLine();
            System.out.println(Arrays.toString(bank_account4));
        }


    }
}
