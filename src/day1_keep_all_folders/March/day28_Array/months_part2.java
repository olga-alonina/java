package day1_keep_all_folders.March.day28_Array;

import java.util.Scanner;

public class months_part2{
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Which month number do you want");
        int mon = input2.nextInt();  // 4

        String [] months2 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        System.out.println(months2[mon - 1]);
    }
}
