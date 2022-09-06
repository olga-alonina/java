package Team_task.Vesa.VesaPackMay26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Permutation_combinations {
    //2) Array - permutation combinations
//Given an array of 3 characters print all permutation combinations from the given characters
    public static void permutation_combinations(Character[] a) {
        int count = 0;
        ArrayList<Character> list = new ArrayList<>( Arrays.asList( a ) );
        int i = 0;
        while (count != (a.length * (a.length - 1))) {
            Collections.swap( list, i, i + 1 );//123 12 23
            count++;
            System.out.println( count + " " + list );
            i++;
            if (i == a.length - 1) {
                i = 0; //213 132   //21 13    //13 32
            }
        }
    }

    public static void main(String[] args) {
        Character[] a = {'a', 'b', 'c'};
        permutation_combinations( a );
    }
}
