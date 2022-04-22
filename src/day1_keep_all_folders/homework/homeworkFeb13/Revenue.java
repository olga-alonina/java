package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price:");
        double price = input.nextDouble();
        System.out.println("Your price:" + price);
        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();
        System.out.println("Your price:" + price);
        System.out.println("Your quantity:" + quantity);
        double total = price * quantity;
        System.out.println("total = " + total);
        
/*
___________________________________________________________________________

Write a program that
asks the user to enter a price and quantity and then calculate the revenue.
revenue = price × quantity.
     */
    }

}
