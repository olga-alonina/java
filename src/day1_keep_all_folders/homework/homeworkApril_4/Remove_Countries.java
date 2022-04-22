package day1_keep_all_folders.homework.homeworkApril_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Countries {
    public static ArrayList<String> remove_Countries(String[] str, int number) {
        ArrayList<String> long_Only = new ArrayList<>();
        for (String each : str) {
            if (each.length() < number) {
                long_Only.add( each );
            }
        }
        return (long_Only);
    }

    public static ArrayList<String> remove_Countries1(ArrayList<String> str, int number) {
        str.removeIf( country -> country.length() >= number );
        return str;
    }

    public static void main(String[] args) {
        String[] str = {"Japan", "Korea", "United States", "Turkey", "United Kingdom",
                "Canada"};
        System.out.println( remove_Countries( str, 7 ) );
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        System.out.println(remove_Countries1(countries,7));
    }
}

