package AH.June6;

import java.util.ArrayList;
import java.util.Arrays;

public class task1_multiplyOfOthers {
    /*Write a function that takes in a non-empty array of integers and returns an array of the same length,
	where each element in the output array is equal to the product of every other number
	in the input array. In other words, the value at output[i] is equal to the product of every
	number in the input array other than input[i] .
*/
    public static ArrayList<Integer> multiplyOfOthers(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>( list );
        int count = 0;
        while (count < list.size() - 1) {
            for (int i = 0; i < list.size(); i++) {
                int result = 1;
                ArrayList<Integer> list2 = new ArrayList<>( list );
                list2.remove( list.get( i ) );
                for (int j = 0; j <= list2.size() - 1; j++) {
                    result *= list2.get( j );
                }
                temp.set( i, result );
                count++;

            }
        }
        return temp;
    }

    public static int[] multiplyOfOthers(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int result = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    result *= arr[j];
                }
            }
            arr1[i] = result;
        }
        return arr1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList( 5, 1, 4, 2 ) );
        int [] arr={5, 1, 4, 2};
        System.out.println( multiplyOfOthers( list ) );
        System.out.println( Arrays.toString(multiplyOfOthers( arr )));
    }
}
