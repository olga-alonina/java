package day1_keep_all_folders.homework.homeworkApril_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList( 1, 3, 5, 1, 4, 5, 9 ) );
        System.out.println( remove_Duplicates( numbers ) );
        System.out.println(removeDuplicates1( numbers ));
    }

    public static ArrayList<Integer> remove_Duplicates(ArrayList<Integer> sent) {
        ArrayList<Integer> no_Repeat = new ArrayList<>();
        for (int i = 0; i < sent.size(); i++) {
            int count = 0;
            for (int j = 0; j < sent.size(); j++) {
                if (sent.get( i ) == sent.get( j )) {
                    count++;
                }
            }
            if (count == 1) {
                no_Repeat.add( sent.get( i ) );

            }
        }
        return no_Repeat;

    }

    public static ArrayList<Integer> removeDuplicates1(ArrayList<Integer> numbers) {

        numbers.removeIf( num -> Collections.frequency( numbers, num ) > 1 );
        return numbers;

    }
}


