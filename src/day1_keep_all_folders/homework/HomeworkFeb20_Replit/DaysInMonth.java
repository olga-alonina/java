package day1_keep_all_folders.homework.HomeworkFeb20_Replit;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your month:");
        String month = input.next();

        switch (month) {
            case "February":
                System.out.println("28 days ");
                break;
            case "April":
            case "June":
            case "September":
            case"November":
                System.out.println("30 days");break;
            case "January":
            case"March":
            case "May":
            case"July":
            case "August":
            case "October":
            case"December":
                System.out.println("31 days");break;
            default:
                System.out.println("Invalid writing");

        }}}
