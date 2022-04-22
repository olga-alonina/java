package day1_keep_all_folders.February.day15_switch_statement;

import java.util.Scanner;

public class newbe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What size coffee do you want?");
        String size = input.next();
        double Price = 0;
        int Calories = 0;
        boolean validOrder = true;

        switch (size) {

            case "Tall":
                Price = 2.50;
                Calories = 100;
                break;
            case "Grande":
                Price = 4.00;
                Calories = 150;
                break;
            case "Venty":
                Price = 4.50;
                Calories = 200;
                break;
            default:
                System.out.println("Not valid size");
                validOrder = false;
        }
        if (validOrder) {
            System.out.println("Your coffe is " + size + " will be $" + Price + " and " + Calories + "calories");

        }
    }
}


