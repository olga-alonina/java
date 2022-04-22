package day1_keep_all_folders.March.day18;

import java.util.Scanner;

public class Tempruture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter tempruture:");
        String day = "Today it is above 70";
        System.out.println(day.contains("it is"));
        System.out.println(day.contains("itis"));
        System.out.println(day.contains("ay it"));
        System.out.println(day.contains("7"));
        System.out.println(day.contains("today"));//False, T, not t
        System.out.println(day.contains("Ti7"));//false


    }
}
