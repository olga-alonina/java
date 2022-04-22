package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

public class Relatives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your name");
        String newName = input.nextLine();
        String lastName1 = "James Bond";

        int findSpace = newName.indexOf(" ");
        String checkNewName = newName.substring(findSpace);
        int findSpaceBond = lastName1.indexOf(" ");
        String onlyLastName = lastName1.substring(findSpaceBond);

        if (checkNewName.equals(onlyLastName)) {
            System.out.println("Related ");
        } else {
            System.out.println("Not Related");
        }

    }
}
