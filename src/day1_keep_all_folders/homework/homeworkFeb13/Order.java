package day1_keep_all_folders.homework.homeworkFeb13;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("please enter a product name ");
        String product_name = input.nextLine();
            System.out.println("Product name is = " + product_name);

            System.out.println("please enter a price ");
        double price = input.nextDouble();
            System.out.println("This product's price is " + price);

            System.out.println("please enter a quantity ");
        int quantity = input.nextInt();
            System.out.println("This product's quantity is " + price);

            System.out.println("please enter your full name");
        input.nextLine();
        String full_name = input.nextLine();
            System.out.println("Your full name is " + full_name);

        double totalCost = price * quantity;

            System.out.println(full_name + ", your order for " + quantity + " "
                    + product_name + " has been placed. Your total is $" + totalCost);



    /*    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your
        total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.*/
    }
}
