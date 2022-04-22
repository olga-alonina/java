package day1_keep_all_folders.homework.HomeworkMarch6;

public class Repeat_Last_Character {
    public static void main(String[] args) {
        //Ex:
        //		Input:
        //			Hello?
        //			3
        //		Output:
        //			Hello????
        String word = "java";
        int repeat = 5;

        String lastLetter = word.substring(word.length() - 1);
        for (int i = 1; i <= repeat; i++) {
            word += lastLetter;
        }
        System.out.println("word = " + word);
    }
}
