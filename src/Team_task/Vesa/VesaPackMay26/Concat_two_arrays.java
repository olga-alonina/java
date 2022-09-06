package Team_task.Vesa.VesaPackMay26;

import java.util.Arrays;

public class Concat_two_arrays {
    // Write a return method that can concate two arrays
    public static void summarize_two_arrays(int[] arr, int[] arr2) {//
        int[] result = null;
        if (arr.length == arr2.length || arr2.length > arr.length) {
            result = new int[arr.length];
            for (int i = 0, j = 0; i < arr.length; i++, j++) {
                result[i] = arr[i] + arr2[j];
            }

        } else {
            result = new int[arr2.length];
            for (int i = 0, j = 0; i < arr2.length; i++, j++) {
                result[i] = arr[i] + arr2[j];

            }
        }
        System.out.println( Arrays.toString( result ) );
    }

    public static void concate_two_arrays(int[] arr, int[] arr2) {
        int[] newArr = new int[arr.length + arr2.length];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            newArr[i] = arr[i];
            i++;
        }
        while (i >= arr.length && i < newArr.length) {
            newArr[i] = arr2[j];
            i++;j++;
        }
        System.out.println(Arrays.toString(  newArr ));
    }

    public static String[] concatTwoArrays2(String[] arr1, String[] arr2) {
        int length = arr1.length + arr2.length;
        String[] mergedArr = new String[length];
        int index = 0;
        for (String element : arr1) {
            mergedArr[index] = element;
            index++;
        }
        for (String element : arr2) {
            mergedArr[index] = element;
            index++;
        }
        return mergedArr;
    }

    public static void main(String[] args) {
        String[] arr1 = {"java", "is", "fun"};
        String[] arr2 = {"selenium", "is", "cool"};
        System.out.println( Arrays.toString( concatTwoArrays2( arr1, arr2 ) ) );
        int[] arr4 = {1, 25, 3, 4, 5};
        int[] arr3 = {6, 5, 4, 38, 2, 1};
        concate_two_arrays( arr4, arr3 );
    }

}
