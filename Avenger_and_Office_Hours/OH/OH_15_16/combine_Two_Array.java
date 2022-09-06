package OH.OH_15_16;

import java.util.ArrayList;
import java.util.Arrays;

public class combine_Two_Array {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        //list ==>{"A", "B", "C", "D", "E", "F", "G"}
        ArrayList<String> list = new ArrayList<>();
        System.out.println( "combine two String arrays into one arrayList" );
        list.addAll( Arrays.asList( arr1 ) );
        list.addAll( Arrays.asList( arr2 ) );
        System.out.println( "list = " + list );
        ArrayList<String> combo = new ArrayList<>();
        //character
        System.out.println( "Character" );

        char[] carr1 = {'A', 'B', 'C'},
                carr2 = {'D', 'E', 'F', 'G'};

        ArrayList<Character> charResult = new ArrayList<>();
        for (char eachChar : carr1) {
            charResult.add( eachChar );
        }
        for (char eachChar : carr2) {
            charResult.add( eachChar );

        }  System.out.println( "charResult "+charResult );
    }
}

