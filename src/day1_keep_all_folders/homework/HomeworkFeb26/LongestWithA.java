package day1_keep_all_folders.homework.HomeworkFeb26;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write 1th word");
        String a = input.nextLine();
        System.out.println("Please write 2th word");
        String b = input.nextLine();
        System.out.println("Please write 3th word");
        String c = input.nextLine();
        String result = " ";

        boolean hasA = a.contains("a") || b.contains("a") || c.contains("a");
        if (a.length()<b.length()){
            String s = a;
            a = b;
            b = s;
        }
        if (a.length()<c.length()){
            String s = a;
            a = c;
            c = s;
        }
        if (b.length()<c.length()){
            String s = b;
            b = c;
            c = s;
        }
        if (a.contains("a")) {
            System.out.println(a);
        } else if(b.contains("a")){
            System.out.println(b);

        }else if(c.contains("a")){
            System.out.println(c);
        }else{
            System.out.println("This word is not contain \"a\" ");
        }
    }
}