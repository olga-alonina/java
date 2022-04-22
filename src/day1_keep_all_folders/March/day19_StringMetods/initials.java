package day1_keep_all_folders.March.day19_StringMetods;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your first name");
        String fname = input.nextLine().toUpperCase();
        System.out.println("Please write your last name");
        String lname = input.nextLine().toUpperCase();
        char result,result2;

        System.out.println(fname.charAt(0)+""+lname.charAt(0));

}}
