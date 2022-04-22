package day1_keep_all_folders.homework.homeworkMarch_27.homeworkMarch_31;

import java.util.ArrayList;
import java.util.Arrays;

public class four_or_less {
    public static void main(String[] args) {
        String[] words = {"apples", "tree", "loop", "cat", "animal", "shortcut"};
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(words));
        ArrayList<String> answer = new ArrayList<>();
        /*, go through and find Strings that are 4
characters or less. */

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).length() <= 4) {
                answer.add(nums.get(i));
            }

        }
        System.out.println(answer);
    }
}

