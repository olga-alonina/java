package day1_keep_all_folders.February.day13_scanner;

import java.util.Scanner;

public class Login_App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last 4 digits of your ssn");
        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

        if (actualPin == expectedPin && actualSSN == expectedSSN) {
            System.out.println("Authentication successful");
        } else {

            System.out.println("Authentication failed");

            if (actualPin != expectedPin) {
                System.out.println("incorrect pin code");
            }

            if (actualSSN != expectedSSN) {
                System.out.println("incorrect ssn");
            }

        }
    }
}
