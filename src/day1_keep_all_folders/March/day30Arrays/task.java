package day1_keep_all_folders.March.day30Arrays;

public class task {
    public static void main(String[] args) {
        String sen = "Today is Monday";
        String[] words = sen.split(" ");
        String reverse = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
        System.out.println(reverse.trim());
    }
}
