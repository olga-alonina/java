package day1_keep_all_folders.homework.homeworkFeb14_and_Day_10_Scanners;

import java.util.*;

public class Replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputSeconds,hours, minutes, seconds;
        System.out.println("please enter the total number of seconds:");
        inputSeconds = input.nextInt();
        seconds = inputSeconds;
        hours = inputSeconds/3600;//3605/3600
        minutes = (seconds%3600)/60;
        seconds = (seconds%3600)%60;
        String time = hours+" hours, "+minutes+" minutes, and "+seconds+" seconds";
        System.out.println(time);

    }

}