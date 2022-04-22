package day1_keep_all_folders.March.day23LoopAgain;

import java.util.Scanner;

public class ShoppingListwLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping list";
        String addMore;
        do{


        System.out.println("Enter the name of item");
        list+="\n*"+input.nextLine();
            System.out.println("Do you wanna add more to you shopping list?");
            addMore = input.nextLine();
    }while(addMore.equalsIgnoreCase("yes"));

}

}
