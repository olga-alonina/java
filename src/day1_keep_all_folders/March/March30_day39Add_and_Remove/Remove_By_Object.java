package day1_keep_all_folders.March.March30_day39Add_and_Remove;

import java.util.ArrayList;

public class Remove_By_Object {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.remove(0);
        System.out.println("nums = " + nums);
        System.out.println("**************");
        Integer i = 500;
        nums.remove(i);
        System.out.println("nums = " + nums);
        System.out.println("**************");
        nums.remove(Integer.valueOf(200));
        System.out.println("nums = " + nums);
        System.out.println("**************");
        nums.remove((Integer) 800);
        System.out.println("nums = " + nums);
    }

}
