package day1_keep_all_folders.February.day16_Review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are left?");
        int minutes = input.nextInt();

        if(minutes<0&&minutes>90){
            System.out.println("Not valid time");
        }
        if(minutes<0){
            System.out.println("minutes cannot be a negative number");
        }
        if(minutes>90){
            System.out.println("games cannot be longer than 90 minutes");
        }
        if (minutes<90&&minutes>=75){
            System.out.println("just getting started");
        }
        if (minutes<=74&&minutes>=60){
            System.out.println("players are doing their best");
                    }
        if (minutes<=59&&minutes>=30){
            System.out.println("middle of the game is going great");
        }
        if (minutes<=29&&minutes>0){
            System.out.println("the end of the same is approaching");}


}}

