package day1_keep_all_folders.March.March30_day39Add_and_Remove;

import java.util.ArrayList;

public class Index_Of_Method {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        String all_repeat = "";
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)==100) {
                all_repeat += " " +i;
            }
        }
        System.out.println("all_repeat = " + all_repeat);

        System.out.println(nums.indexOf(100));
        System.out.println(nums.indexOf(700));

        int i = nums.indexOf(200);
        System.out.println(i);

        System.out.println("last index=" + nums.lastIndexOf(100));

        nums.remove((Integer) 100);
        System.out.println(nums.indexOf(100));


    }
}
