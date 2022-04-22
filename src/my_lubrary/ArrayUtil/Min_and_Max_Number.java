package my_lubrary.ArrayUtil;

import java.util.Arrays;

public class Min_and_Max_Number {
    public static void main(String[] args) {
        System.out.println(min_Number(new int[]{-66, 6, 9, -5, 1, 4, 1, -55}));
        System.out.println("**********");
        System.out.println(max_Number(new int[]{-66, 6, 9, -5, 1, 4, 1, -55}));
        System.out.println("**************");
        System.out.println(min_Number1(new int[]{-66, 6, 9, -5, 1, 4, 1, -55}));
        System.out.println("***************");
        System.out.println(max_Number1(new int[]{-66, 6, 9, -5, 1, 4, 1, -55}));
    }

    public static int min_Number(int[] arr) {
        int min = arr[0];
        for (int number : arr) {
            if (number <= min) {
                min = number;
            }
        }
        return min;
    }

    public static int max_Number(int[] arr) {
        int max = arr[0];
        for (int number : arr) {
            if (number >= max) {
                max = number;
            }
        }
        return max;
    }

    public static int min_Number1(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int max_Number1(int[] arr) {
        min_Number1(arr);
        return arr[arr.length - 1];
    }
}
