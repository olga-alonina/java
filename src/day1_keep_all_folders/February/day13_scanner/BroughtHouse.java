package day1_keep_all_folders.February.day13_scanner;

import java.util.Scanner;

public class BroughtHouse {
           public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               System.out.println("Enter maximum budget");
               int maxBudget = in.nextInt();
               String name, range;
               double rating;
               boolean gated, allowPets;

                if (maxBudget >= 50_000 && maxBudget <= 90_000) {
                   name = "Hills";
                   range = "50,000 - 90,000";
                   rating = 3.5;
                   gated = false;
                   allowPets = true;
                    System.out.println("You house will be in "+name);
               } else if (maxBudget >= 101_000 && maxBudget <= 140_000) {
                   name = "Oaks";
                   range = "101,000 - 140,000";
                   rating = 4.5;
                   gated = true;
                   allowPets = false;
                    System.out.println("You house will be in "+name);
               } else if (maxBudget >= 151_000 && maxBudget <= 190_000) {
                   name = "Cedar";
                   range = "151,000 - 190,000";
                   rating = 4.7;
                   gated = true;
                   allowPets = true;
                    System.out.println("You house will be in "+name);
               } else if (maxBudget >= 201_000 && maxBudget <= 299_000) {
                   name = "Canyon";
                   range = "201,000 - 299,000";
                   rating = 4.9;
                   gated = true;
                   allowPets = true;
                    System.out.println("You house will be in "+name);
               } else if (maxBudget <= 0) {
                    System.out.println("Your budget cannot be below zero");}

                 else {
                    System.out.println("Too much money for these houses");
                }
            }
        }



