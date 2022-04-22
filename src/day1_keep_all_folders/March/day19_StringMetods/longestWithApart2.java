package day1_keep_all_folders.March.day19_StringMetods;

import java.util.Scanner;

public class longestWithApart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write 1th word");
        String a = input.nextLine().toLowerCase();
        System.out.println("Please write 2th word");
        String b = input.nextLine().toLowerCase();
        System.out.println("Please write 3th word");
        String c = input.nextLine().toLowerCase();
        String result = " ";


        if (a.contains("a") && a.length() > result.length()) {
            result = a;
        } else if (b.contains("a") && b.length() > result.length()) {
            result = b;
        } else if (c.contains("a") && c.length() > result.length()){
            result = c;
        }
    else{
            System.out.println(result.isEmpty() ? "No single largest word with a" : result + " is the longest word with a");
        }
    }
}
