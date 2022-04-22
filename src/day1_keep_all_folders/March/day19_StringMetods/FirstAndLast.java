package day1_keep_all_folders.March.day19_StringMetods;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your sentance");
        String sent = input.nextLine();
        System.out.println("first char: "+sent.charAt(0));
        System.out.println("last char: "+sent.charAt(sent.length()-1));


    }}
