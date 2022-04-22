package day1_keep_all_folders.March.day28_Array;

import java.util.Scanner;

public class months_part3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which month number do you want");
        int mon = input.nextInt();  // 4

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        System.out.println(months[mon - 1]);

        // 4th month -> months[4 - 1] == months[3] --> April
    }
}
