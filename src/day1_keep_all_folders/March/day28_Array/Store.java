package day1_keep_all_folders.March.day28_Array;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        String[]items = {"Shoes", "Jackets", "Gloves","Airpods", "Ipads"};
        String[] name = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have Jackets?");
        boolean has_Jacket = false;


        for(int i = 0; i<items.length;i++){
            if (items[i].equalsIgnoreCase("jackets")){
                has_Jacket = true;
                break;
                            }
        }
        System.out.println(has_Jacket? "in stock":"out of stock");
    }
}
