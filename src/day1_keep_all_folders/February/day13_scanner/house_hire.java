package day1_keep_all_folders.February.day13_scanner;

import java.util.Scanner;

public class house_hire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you wanna spend on house? ");
        int amount_money = input.nextInt();
        if (amount_money >= 80_000 && amount_money <= 100_000) {
            String name = "Hils";
            double rating = 4.0;
            boolean IsGated = false;
            boolean allowed_pets = false;
            System.out.println("Your house will be located in " + name + " \n" +
                    "" + rating + " rating. " + IsGated + " gated. Pets " + allowed_pets);
        } else if (amount_money <= 75_000 && amount_money >= 55_000) {
            String name = "Oaks";
            double rating = 3.5;
            boolean IsGated = false;
            boolean allowed_pets = true;
            System.out.println("Your house will be located in " + name + " \n" +
                    "" + rating + " rating. " + IsGated + " gated. Pets " + allowed_pets);
        } else if (amount_money >= 120_000 && amount_money <= 150_000) {
            String name = "Highland";
            double rating = 4.5;
            boolean IsGated = true;
            boolean allowed_pets = false;
            System.out.println("Your house will be located in " + name + " \n" +
                    "" + rating + " rating. " + IsGated + " gated. Pets " + allowed_pets);
        } else if (amount_money >= 160_000 && amount_money <= 201_000) {
            String name = "Canyon";
            double rating = 4.8;
            boolean IsGated = true;
            boolean allowed_pets = true;
            System.out.println("Your house will be located in " + name + " \n" +
                    "" + rating + " rating. " + IsGated + " gated. Pets " + allowed_pets);
        } else if (amount_money >= 201_000)
            System.out.println("No available houses");
        else if (amount_money <= 0) {
            System.out.println("You dont have enough money");
        }
    }
}


