package day1_keep_all_folders.March.day19_StringMetods;

import java.util.Scanner;

public class webSitePart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a url");
        String url = input.nextLine();
        int s = url.length();

        String website = url.substring(4, url.length() - 4);
        System.out.println("Result: "+ website);
    }

    }

