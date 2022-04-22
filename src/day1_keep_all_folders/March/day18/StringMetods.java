package day1_keep_all_folders.March.day18;

import java.util.Scanner;

public class StringMetods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        String s = "pen";
        String s2 = new String("pen");
        System.out.println("Compare with =="+(s==s2));
        System.out.println("Compare with .equal ()"+(s==s2));
        System.out.println("Compare with .equal ()"+ s.equals("Pen"));
        System.out.println("Compare with .equalsIgnoreCase ()"+s.equalsIgnoreCase("Pen"));

        boolean IsSame = s.equalsIgnoreCase("PEN");
        if (s.equals("pen")) {}

            int len = s.length();
            System.out.println(len);
            if(s.length()>4){
                System.out.println("Long word");
        }else {
                System.out.println("Short word");
            }
        System.out.println("*******************");
        System.out.println(("aaaa").length());
        System.out.println(("aa aa").length());
        String str = "sNOw";

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str);

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);

        int a = 4;
        a++;
        a += 5;
        System.out.println(a);

        String word2 = word + "WORLD";
        System.out.println(word2);
        System.out.println(word);

        word += "new text";  // word = word + "next text"

        System.out.println(word);

        String old = "mark";
        String newValue =  old.toUpperCase();

        System.out.println(old);
        System.out.println(newValue);
}}
