package day1_keep_all_folders.homework.homeworkApril_4;

public class counting_letters {
    public static int counting_Letters(String[] praise, char chose_letter) {
        int count = 0;
        for (String word : praise) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt( i ) == chose_letter) {
                    count++;
                }
            }
        }
        return (count);
    }

    public static void main(String[] args) {
        char chose_letter = 'a';
        String[] praise = {"java", "html", "css", "java", "javascript", "selenium"};
        System.out.println(counting_Letters( praise,chose_letter));
    }
}
