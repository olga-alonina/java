package day1_keep_all_folders.March.March16_day31;

import java.util.Arrays;

public class Equals_example {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[]c = a;
        System.out.println(a == b);
        System.out.println(Arrays.equals(a,b));
        System.out.println(a==c);
        boolean same = Arrays.equals(a,b);
        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d));
    }
}
