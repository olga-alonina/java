package day1_keep_all_folders.March.day28_Array;

import java.util.Scanner;

public class Store2 {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "Ipads"};
        String[] name = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Wich item are you looking for?");
        String nameOfItem = input.next();

        boolean has_items = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(nameOfItem)) {
                has_items = true;
                break;
            }
        }
        System.out.println((has_items)?"Its in stock":"its out of stock");

    }
}

