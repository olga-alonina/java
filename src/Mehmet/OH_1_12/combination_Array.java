package Mehmet.OH_1_12;

import java.util.Arrays;

public class combination_Array {
    //Create a method that can print out the combination of two integer arrays
    //                int[] array1 = {1,2,3,4};
    //                int[] array2 = {5,6,7,8,9,10};
    //
    //                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    public static void add_Two_Array(int[] array1, int[] array2) {
        int size = array1.length + array2.length;
        int[] arr = new int[size];
        int[] array = Arrays.copyOf(array1, size);
        int i = array1.length;

        for (int j = 0; j < array2.length; j++) {
            array[i + j] = array2[j];

        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8,9,10};
        add_Two_Array(array1, array2);
    }
}
