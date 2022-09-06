package day1_keep_all_folders.May.May_21_day61_maps.countries;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> countries = new HashMap<>();
        countries.put( "USA", new ArrayList<>( Arrays.asList( "Chicago", "New York", "Atlanta", "Dallas" ) ) );
        countries.put( "Turkey", new ArrayList<>( Arrays.asList( "Izmir", "Istanbul", "Ankara", " Antal-ya", "Adana" ) ) );
        countries.put( "Canada", new ArrayList<>( Arrays.asList( "Quebec", "Toronto", "Vancouver" ) ) );
        System.out.println( countries );
        for (ArrayList<String> city : countries.values()) {
            for (String name : city) {
                if (name.startsWith( "I" ) || name.startsWith( "D" )) {
                    System.out.println( name );
                }
            }
        }
        System.out.println();
        System.out.println( "What Country do you want to tour?" );
        Scanner input = new Scanner( System.in );
        String country = input.nextLine();

        for (String cities : countries.get( country )) {
            System.out.println( "Touring..." + cities );
        }
    }
}
