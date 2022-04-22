package day1_keep_all_folders.homework.homeworkFeb15;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time: ");
        int time = input.nextInt();

        if (6<=time&&time<=11){
            System.out.println("Good morning");}


        if (12<=time&&time<=16){
            System.out.println("Good evening");}


        if (17<=time&&time<=23){
            System.out.println("Good night");}

        }}


        //create an int value for the time of the day. Use a 24 hour format
        //use the given time of day to display a message
        //hint: use seperate if statements
        //if the hours are from 6 - 11, print: Good morning
        //if the hours are from 12 - 16, print: Good evening
        //if the hours are from 17 - 23, print: Good night


