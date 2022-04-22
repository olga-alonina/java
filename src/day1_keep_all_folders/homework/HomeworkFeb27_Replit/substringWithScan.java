package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

import java.util.Scanner;

public class substringWithScan {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();

        String pref = str.substring(0, n);//first chose pref

        str = str.substring(n);//got place for checkinf for next plef seq

        if (str.contains(pref)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}

