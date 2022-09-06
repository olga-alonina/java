package day1_keep_all_folders.homework.HomeworkFeb20_Replit;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are you stay in the hotel:");
        int number_of_days = input.nextInt();
        System.out.println("How many peope will be here?");
        int numberOfPeople = input.nextInt();
        String room_type = " ";
        double price = 0;

        switch (numberOfPeople) {
            case 1:
                room_type = "Single room";
                price = number_of_days * 100;
                break;
            case 2:
                room_type = "Double room";
                price = number_of_days * 125;
                break;
            case 3:
            case 4:
                room_type = "Large room";
                price = number_of_days * numberOfPeople * 150;
                break;
            case 5:
            case 6:
            case 7:
                room_type = "Suite";
                price = number_of_days * 5000;
                break;
            default:
                System.out.println("Sorry we don 'title have any available rooms for that size party");   }

    System.out.println("Your room will be "+room_type+ " for a $ "+price+" . Enjoy your day!");
}}
