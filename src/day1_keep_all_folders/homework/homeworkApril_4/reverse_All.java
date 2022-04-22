package day1_keep_all_folders.homework.homeworkApril_4;

import java.util.ArrayList;
import java.util.Arrays;

import static my_lubrary.StringUtil.reverse.reverse;

public class reverse_All {
    public static ArrayList<String> reverse_All(ArrayList<String> original) {
        ArrayList<String> reverse = new ArrayList<>();
        for (String words : original) {
            reverse.add( reverse( words ) );
        }
        return reverse;
    }

    public static ArrayList<String> reverse_All1(ArrayList<String> original) {
        ArrayList<String> reverse = new ArrayList<>();
        for (String words : original) {
            String newWords = getString( words );
            reverse.add( newWords );
        }
        return (reverse);
    }

    private static String getString(String words) {
        String newWords = "";
        for (int i = words.length() - 1; i >= 0; i--) {
            newWords += words.charAt( i );
        }
        return newWords;
    }

    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>( Arrays.asList("Ted", "Talk", "Learn"));
        System.out.println(reverse_All(original));
        System.out.println(reverse_All1( original ));

    }

}


       /*
@param words - Given ArrayList of Strings
@return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}*/

