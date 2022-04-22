package day1_keep_all_folders.homework.Homework_April_12;

import java.util.ArrayList;
import java.util.Arrays;

public class UseOffer2 {
    public static void main(String[] args) {
        Offer unit1 = new Offer( "A", "Chicago", 125_000, true, 10 );
        Offer unit2 = new Offer( "B", "Huston", 155_000, true, 8 );
        Offer unit3 = new Offer( "C", "Denver", 95_000, false, 6 );
        Offer unit4 = new Offer( "D", "Vancouver", 105_000, false, 9 );
        Offer unit5 = new Offer( "E", "Boston", 135_000, true, 6 );
        Offer unit6 = new Offer( "F", "New York", 175_000, false, 3 );
        Offer unit7 = new Offer( "G", "Los Angeles", 225_000, true, 8 );
        ArrayList<Offer> list3 = new ArrayList<>( (Arrays.asList( unit1, unit2, unit3, unit4, unit5, unit6, unit7 )) );
        ArrayList<Offer> near = new ArrayList<>( list3 );
        near.removeIf( each -> !each.location.equals( "Chicago" ) );
        System.out.println( "near" + near );
        ArrayList<Offer> fullTime = new ArrayList<>( list3 );
        fullTime.removeIf( each -> !each.isFullTime );
        System.out.println( "fullTime = " + fullTime );
        ArrayList<Offer> bigSalary = new ArrayList<>( list3 );
        fullTime.removeIf( each -> each.salary>150_000 );
        System.out.println( "bigSalary = " + bigSalary );
    }
}
