package OH.OH_1_12;

import java.util.Arrays;

public class Array_start_and_End {
    public static void main(String[] args) {
        int start = 5;
        int end = 10;

        int[] nums = new int[end - start];
        int count = 0;
        for (int i = start; i < end; i++) {
            nums[count] = i;
            count++;
        }
        System.out.println(Arrays.toString(nums));
    }
}