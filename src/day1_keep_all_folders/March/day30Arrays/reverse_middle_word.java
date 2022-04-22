package day1_keep_all_folders.March.day30Arrays;

public class reverse_middle_word {
    public static void main(String[] args) {
        String sen = "Today always Monday";
        String[] words = sen.split(" ");
        String reverse="";
        char[] secWord = words[1].toCharArray();

        for (int k = secWord.length - 1; k >= 0; k--) {
            reverse+=secWord[k];

        }
        System.out.println(words[0]+" "+ reverse+" "+words[2]);
    }
}
