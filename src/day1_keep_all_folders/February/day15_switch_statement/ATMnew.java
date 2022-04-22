package day1_keep_all_folders.February.day15_switch_statement;

import java.util.Scanner;

public class ATMnew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the ATM. \nPlease select one of the following option:\n Snacks\n Drinks\n Gums");
        String selection = input.next();
        String item = "";
        switch (selection) {
            case "Drink":
                System.out.println("Choose your usingCoffee:\n1. Water\n2. Soda\n 3.Juice");
                int drinkNum = input.nextInt();
                if (drinkNum == 1) {
                    item = "Water";
                } else if (drinkNum == 2) {
                    item = "Soda";
                } else if (drinkNum == 3) {
                    item = "Juice";
                }
                break;
            case "Snacks":
                System.out.println("Choose your usingCoffee:\n4. Chips\n5. Cookies");
                int snackNum = input.nextInt();
                if (snackNum == 4) {
                    item = "Chips";
                } else if (snackNum == 5) {
                    item = "Cookies";
                }
                break;
            case "Gums":
                item = "Some gum";

        }
        System.out.println("Item is " + item);
    }
}