package day1_keep_all_folders.homework.Homework_April_11;

import day1_keep_all_folders.homework.Homework_April_12.Offer;

public class UseOffer {
    public static void main(String[] args) {
        Offer offer1 = new Offer( "Apple", "California" );
        System.out.println( offer1 );
        Offer offer2 = new Offer( "Facebook", "Sacramento", 120_000 );
        System.out.println( offer2 );
        Offer offer3 = new Offer( "Bank of America", "Chicago", 130_000, true, 40.0 );
        System.out.println( offer3 );
    }
}

