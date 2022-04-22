package day1_keep_all_folders.March.day19_StringMetods;

import java.util.Scanner;

public class IndexOfMetods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a url");
        String a = "pen";
        System.out.println(a.indexOf("p"));
        System.out.println(a.indexOf("e"));
        System.out.println(a.indexOf("n"));
        System.out.println(a.indexOf("x"));
        System.out.println("**************");
        System.out.println(a.indexOf("pe"));
        System.out.println(a.indexOf("pz"));
    }
}
