package day1_keep_all_folders.homework.HomeworkMarch6;

public class Camel_Case {
    public static void main(String[] args) {
        //Given a String with multiple words separated by spaces,
        // create a camel case version of the words. Every word, except the first word,
        // begin with an uppercase letter. The other characters of the word will be lowercase
        //Today is SUNDAY
        // 	Output: todayIsSunday
        String word = "Today is Sunday dear MONDAY";
        word = word.trim().toLowerCase();

        int counLet = 0;
        String btw = "";
        String total = "";
        String cam1 = "";


        for (int i = 0; i < word.length(); i++) {
            btw += word.charAt(i);
            if (word.charAt(i) == ' ') {
                counLet++;
                if (counLet >= 2) {
                    btw = btw.toUpperCase().charAt(0) + btw.substring(1);

                }
                total += btw;
                btw = "";
            }
        }
        btw = btw.toUpperCase().charAt(0) + btw.substring(1);
        total += btw;

        if (total.contains(" ")) {
            total = total.replaceAll(" ", "");
        }
        System.out.println(total);
    }
}
