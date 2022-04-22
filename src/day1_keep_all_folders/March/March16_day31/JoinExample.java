package day1_keep_all_folders.March.March16_day31;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String[]words = {"a","b","c"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join("<>",words));
        System.out.println(String.join(">",words));

    }
}
