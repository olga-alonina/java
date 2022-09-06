package day1_keep_all_folders.June4_day65_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EtsyEx {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>( Arrays.asList(
                new Item("Flower Necklace", 18.89, 5),
                new Item("Garden Stone", 19.99, 5),
                new Item("Custom Necklace", 14.00, 4),
                new Item("Gift box", -43.00, 5),
                new Item("Bracelet", 10.50, 5)
        ));

        // TC: front page should have only 5 star items
        long actual5Stars = items.stream().filter(p -> p.getStars() == 5).count();

        if(actual5Stars == items.size()){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // TC: prices are valid, not 0
        System.out.println(items.stream().noneMatch(p -> p.getPrice() <= 0 ) ? "PASS " : "FAIL");



    }
}