package day1_keep_all_folders.homework.HomeworkMarch6;

public class Cat_Dog_R {
    public static void main(String[] args) {
        String str = "catdogcat";
        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("cat") && !str.contains("Dog")) {
                result = "false";
            } else if (!str.contains("cat") && str.contains("Dog")) {
                result = "false";
            } else if (str.contains("cat") && str.contains("Dog")) {
                str = str.replaceFirst("cat", "");
                str = str.replaceFirst("dog", "");
             result = "true";
        }
    }System.out.println(result);

}}


