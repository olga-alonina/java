package day1_keep_all_folders.homework.homeworkMarch20;

public class LastCharacter_2D {
    public static void main(String[] args) {
        String[][] array = {{"James", "is", "back"}, {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}};
        for (String[] eachArray : array) {

            for (String eachWord : eachArray) {
                System.out.print(eachWord.charAt(eachWord.length() - 1));
            }
            System.out.println();
        }

    }
}

