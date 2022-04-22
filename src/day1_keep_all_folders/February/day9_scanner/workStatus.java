package day1_keep_all_folders.February.day9_scanner;

import java.util.Scanner;

public class workStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first_name = input.next();
        System.out.println("First Name = " + first_name);

        System.out.println("Enter your last name:");
        String last_Name = input.next();
        System.out.println("Last name = " + last_Name);

        System.out.println("Are you employed?:");
        boolean areYouEmployed = input.nextBoolean();
        System.out.println("Are you employed?:" + areYouEmployed);

        System.out.println("Are you student?");
        boolean areYouStudent = input.nextBoolean();
    String details = first_name+" "+last_Name+" is employed "+ areYouEmployed+
            " and they are student"+ areYouStudent;
        System.out.println("details = " + details);
    }

}
