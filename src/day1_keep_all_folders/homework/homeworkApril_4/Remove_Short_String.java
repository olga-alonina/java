package day1_keep_all_folders.homework.homeworkApril_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Short_String {
    public static ArrayList<String> remove_Short_String(String[] str, int number) {
        ArrayList<String> long_Only = new ArrayList<>();
        for (String each : str) {
            if (each.length() >= number) {
                long_Only.add( each );
            }
        }
        return (long_Only);
    }

    public static ArrayList<String> remove_Short_String(ArrayList<String> list, int maxLength) {

        list.removeIf( word -> word.length() < maxLength );

        return list;
    }

    public static void main(String[] args) {
        int number = 4;
        String[] str = {"one", "two", "three", "four", "five", "six"};
        System.out.println( remove_Short_String( str, number ) );
        ArrayList<String> words = new ArrayList<>( Arrays.asList( "one", "two", "three", "four", "five", "six" ) );
        System.out.println( remove_Short_String( words, 4 ) );
    }
}
