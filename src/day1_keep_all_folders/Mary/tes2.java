package day1_keep_all_folders.Mary;

public class tes2 {
    public static void main(String[] args) {
        String str = "neverGiveUp";
        //            01234567890
        //                 012345
        String word = "";
        String camelCase = "";
        int count = 0;

        for (int i = 0; i < str.length() + 1; i++) {
            char each = str.charAt(i);
            if (each >= 'a' && each <= 'z') {
                count++;
                if (count == 1) {
                    word = str.substring(0, 5);
                }
            }
            if (count == 5) {
                word = camelCase.substring(0, 4);
            }
            if (count == 9) {
                word = str.substring(9, str.length());
            }
            word = " " + word + " ";
            System.out.println(word.trim());
            camelCase = str.substring(5, str.length());
            count += 3;
            if (count >9) {
                break;
            }
        }
    }
}


