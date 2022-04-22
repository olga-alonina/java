package day1_keep_all_folders.homework.homeworkMarch_27.homeworkMarch_31;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_word {
    public static void main(String[] args) {
        String target = "java";
        int count = 0;
      String[] words =  {"java", "html", "css", "java", "javascript", "selenium"};
        ArrayList<String> nums = new ArrayList<>(Arrays.asList(words));
        for (int i = 0; i < nums.size() ; i++) {
            if(nums.get(i).equals(target)){
                count++;
            }

        }
        System.out.println(count);

    }


}
