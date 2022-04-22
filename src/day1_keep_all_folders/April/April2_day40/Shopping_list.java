package day1_keep_all_folders.April.April2_day40;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping_list {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        ArrayList<String> shopping_list = new ArrayList<>();
        System.out.println( shopping_list.isEmpty() ? "Shopping List Empty" : "You have some items" );
        String keepAsking;
        do {
            System.out.println( "Enter the item" );
            shopping_list.add( input.nextLine() );
            System.out.println( "Do you wanna add more items y/n" );
            keepAsking = input.nextLine();
        } while (keepAsking.equals( "yes" ));
        System.out.println( "Shopping List" );
        System.out.println( "Shopping List: " + shopping_list.size() + " items" );
        for (String item : shopping_list) {
            System.out.println( "*\t" + item );
        }
        System.out.println( "***********************" );
        System.out.println( shopping_list.contains( "water" ) ? "you have this item on list" : "You do not have " +
                "this item on the list" );
        System.out.println( "Do you wanna remove ane items?" );
        if (input.nextLine().equals( "yes" )) {
            System.out.println( "What item do you want to remove?" );
            String removeItem = input.nextLine();
            if (Character.isDigit( removeItem.charAt( 0 ) )) {//checks if its number
                int number = Integer.parseInt( removeItem );
                shopping_list.remove( number - 1 );//convert number to index
                // (index starts from 0, in order to remove 1 we need to -1
            } else {
                shopping_list.remove( removeItem );
            }
        }
        System.out.println( "Total shopping list:" );
        for (String item : shopping_list) {
            System.out.println( "*\t" + item );
        }
    }
}
