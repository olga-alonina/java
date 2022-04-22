package day1_keep_all_folders.homework.homeworkMarch29;

import java.util.ArrayList;

public class Add_To_Arrays {
    public static void main(String[] args) {
        ArrayList<String> practice = new ArrayList<>();
        practice.add("Hat");
        practice.add("Shoes");
        practice.add(1, "Jacket");
        practice.add(0, "Towel");
        practice.add(1, "Car");
        System.out.println(practice);

    }
}
