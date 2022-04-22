package day1_keep_all_folders.homework.HomeworkMarch6;

public class Reverce_2_word {
    public static void main(String[] args) {

        String word = "i live Java";
        word = word.trim().toLowerCase();
        String mid = "";
        String total = "";
        String newWord = "";

        mid = word.substring(word.indexOf(" "), word.lastIndexOf(" "));

        for (int i = mid.length(); i > 0; i--) {
            // System.out.print(word.charAt(i));
            newWord += word.charAt(i);
            newWord = newWord.trim();
        }
        total = word.charAt(0) + " " + newWord + word.substring(word.lastIndexOf(" "));//can use replace
        System.out.println("total = " + total);
    }
}