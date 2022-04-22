package day1_keep_all_folders.homework.homeworkMarch16;

public class Reverse_all_words {
    public static void main(String[] args) {
        String sen = "It started to snow in Chicago";
        String[] words = sen.split(" ");

        String reverse;

        for (String newWords : words) {
            reverse = newWords + " ";
            char[] result = reverse.toCharArray();

            for (int k = result.length-1; k >= 0; k--) {
                System.out.print(result[k]);
            }
        }
    }
}