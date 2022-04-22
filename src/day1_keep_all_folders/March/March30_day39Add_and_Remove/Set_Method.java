package day1_keep_all_folders.March.March30_day39Add_and_Remove;

import java.util.ArrayList;

public class Set_Method {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.set(0,-100);
        System.out.println("nums = " + nums);
        nums.set(2,50_000);
        System.out.println("nums = " + nums);
       // nums.set(10,700);  - out of bounds
    }
}
