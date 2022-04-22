package day1_keep_all_folders.March.March16_day31;

import java.util.Arrays;

public class sort_example {
    public static void main(String[] args) {
        int[] nums = {1, 44, 68, 445, 56, -555, 6689, 222, 0};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //min and max
        System.out.println("Min num = " + nums[0]);
        System.out.println("Max num = " + nums[nums.length-1]);
    }
}
