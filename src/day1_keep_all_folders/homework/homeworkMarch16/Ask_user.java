package day1_keep_all_folders.homework.homeworkMarch16;

import java.util.Arrays;
import java.util.Scanner;

public class Ask_user {
    public static void main(String[] args) {
        //Ask the user to enter their first name
        //Convert the name into a char array
        //print the first and last letter of the name
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter your first name");
        String FN = input.next();
        char[] Name = FN.toCharArray();
        System.out.println(Arrays.toString(Name));
        System.out.println("FL is "+ Name[0]);
        System.out.println("LL is "+Name[Name.length-1]);
    }

}
