package day1_keep_all_folders.May.May_21_day61_maps;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add( "Olga" );
        list.add( "Alex" );
        list.add( "Kris" );
        System.out.println( list );
        Iterator<String> it = list.iterator();
        System.out.println( "1" + it.next() );//move the pin and return the element
        System.out.println( "2" + it.next() );
        System.out.println( "3" + it.next() );
        // System.out.println("4"+it.next());//not 4 element//.NoSuchElementException
    }}

