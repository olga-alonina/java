package day1_keep_all_folders.March.March19_ArrayMetod_day32;

import java.util.Arrays;

public class rename_me {
    public static void main(String[] args) {

        int[] arr = {30, 90, 60, 360, 180};
        int[] arr2 = {180, 360, 30, 90, 60};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Before sorting: " + Arrays.equals(arr, arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("After sorting: " + Arrays.equals(arr, arr2));

        String[] words = {"hello", "java", "Saturday"};

        System.out.println(String.join(" ### ", words));

        String str = "Today is Saturday";

        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(Arrays.toString(str.split(" ")));
    }
}