package day1_keep_all_folders.homework.homeworkMarch_27.homeworkMarch_31;

import java.util.ArrayList;

public class Hide_Password {
    public static void main(String[] args) {
        String[] words = {"one", "hi", "hold"};
        ArrayList<String> result = new ArrayList<>();

        for (String each : words) {
            String countLetter = "";
            for (int i = 0; i < each.length(); i++) {
                countLetter += "*";
            }
            result.add(countLetter);
        }
        System.out.print(result);

    }
}
