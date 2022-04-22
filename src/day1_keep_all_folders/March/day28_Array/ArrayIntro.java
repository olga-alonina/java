package day1_keep_all_folders.March.day28_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String[] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburgh"};

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        System.out.println(cities[4] + " " + cities[3] + " " + cities[2] + " " + cities[1] + " " + cities[0]);

        System.out.println(Arrays.toString(cities));

        System.out.println(cities.length);
    }

}
