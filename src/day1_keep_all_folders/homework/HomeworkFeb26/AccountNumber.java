package day1_keep_all_folders.homework.HomeworkFeb26;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your an account number");
        String accNumber = input.nextLine();

        String result = " ";

        if (accNumber.isEmpty()) {
            result = "Empty input given";}

        else if (accNumber.startsWith("2")) {
            if (accNumber.length() == 7) {
                result = "Valid 7-digit account number";
            } else {
                result = "Invalid 7-digit account number";
            }
        }
        else if (accNumber.startsWith("5")) {
            if (accNumber.length() ==10) {
                result = "Valid 10-digit account number";
            } else {
                result = "Invalid 10-digit account number";
            }
        } else {
            result = "Invalid account number";

        }
        System.out.println(result);
    }
}

