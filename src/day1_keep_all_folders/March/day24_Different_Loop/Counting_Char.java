package day1_keep_all_folders.March.day24_Different_Loop;

public class Counting_Char {
    //Ex:
    //Input: 2juMp41EEkd4s4
    //Output:
    //3 uppercase letters
    //6 lowercase letters
    //5 numbers
    public static void main(String[] args) {

        String word = "2juMp41EEkd4s4";
        int counterUp = 0;
        int counterLow = 0;
        int counterNumb = 0;
        // System.out.println("Dlina ="+word.length());

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);//4
            if (c >= 'a' && c <= 'z') {
                counterLow++;
            } else if (c >= 'A' && c < 'Z') {
                counterUp++;
            } else if (c >= '0' && c <= '9') {
                counterNumb++;
            }
        }
        System.out.println("Lower letters: " + counterLow);
        System.out.println("Upper case: " + counterUp);
        System.out.println("Numers: " + counterNumb);
    }
}
