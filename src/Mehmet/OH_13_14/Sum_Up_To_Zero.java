package Mehmet.OH_13_14;

import java.util.Arrays;

public class Sum_Up_To_Zero {
    public static String sum_Up_To_Zero(int N) {

        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i;
            sum += i;
        }
        arr[arr.length - 1] = -sum;
        return Arrays.toString(arr);

    }

    public static void main(String[] args) {
        System.out.println(sum_Up_To_Zero(5));
    }
}
