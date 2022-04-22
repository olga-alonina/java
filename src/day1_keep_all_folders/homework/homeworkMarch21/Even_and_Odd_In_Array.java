package day1_keep_all_folders.homework.homeworkMarch21;

import java.util.Arrays;

public class Even_and_Odd_In_Array {
    public static void even_And_Odd(int[] array) {
        //Create a method that accepts an int array. Count how many even
        // and odd numbers there is. Print an array at the end where the first element
        // is how many even numbers there was and the second element in the number of odd elements
        //
        //	Ex:
        //		input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
        //
        //		input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
        int countOdd = 0;
        int countEven = 0;

        for (int numbers : array) {
            if (numbers % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] evOdArray = new int[2];
        evOdArray[0] = countEven;
        evOdArray[1] = countOdd;
        System.out.println(Arrays.toString(evOdArray));
    }

    public static void main(String[] args) {
        int[] array = {6, 8, 9, 5, 4, 6, 7, 8};
        even_And_Odd(array);
    }
}
