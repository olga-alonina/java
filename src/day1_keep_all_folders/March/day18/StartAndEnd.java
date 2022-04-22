package day1_keep_all_folders.March.day18;

import java.util.Scanner;

public class StartAndEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));
        System.out.println(str.startsWith("Apples"));
        System.out.println("*************");
        String  s ="App";
        System.out.println(str.startsWith(s));
        System.out.println(str.startsWith(" App"));
        System.out.println("**************");
        System.out.println(str.startsWith("Aoo"));
        System.out.println(str.startsWith( "App"));
        System.out.println("***************");
        String sentense = "today was the good day";
        System.out.println(sentense.startsWith("today was a"));
        System.out.println(sentense.endsWith("day"));
        System.out.println(sentense.endsWith(" day"));
        System.out.println(sentense.endsWith("good"));
        System.out.println(sentense.endsWith("today was the good day"));


}}
