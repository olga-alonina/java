package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

public class SepareteApartEmail {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW
        int firstName = email.indexOf("_");

        int lastNameStart = email.indexOf("_");
        int lastNameEnd = email.indexOf("@");

        int domainStart = email.indexOf("@");
        int domainEnd = email.indexOf(".");

        String FixfirstName = email.substring(0, 1).toUpperCase() + email.substring(1, firstName);
        String FixLastName = email.substring(lastNameStart + 1, lastNameStart + 2).toUpperCase() + email.substring(lastNameStart + 2, lastNameEnd);
        String FixDomain = email.substring(domainStart + 1, domainStart + 2).toUpperCase() + email.substring(domainStart + 2, domainEnd);

        System.out.println("First name: " + FixfirstName);
        System.out.println("Last name: " + FixLastName);
        System.out.println("Domain: " + FixDomain);
//  Input:
//    jeff_bezos@amazon.us
//
//  Output:
//    First name: Jeff
//    Last name: Bezos
//    Domain: Amazon


    }
}

