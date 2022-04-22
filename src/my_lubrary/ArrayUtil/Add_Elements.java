package my_lubrary.ArrayUtil;

import java.util.Arrays;

public class Add_Elements {
    public static void main(String[] args) {
        System.out.println(add_Elements(new int[]{1, 2, 3, 4, 5}, 6));
    }

    public static String add_Elements(int[] arr, int number) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = number;
        return Arrays.toString(newArr);
    }
}
