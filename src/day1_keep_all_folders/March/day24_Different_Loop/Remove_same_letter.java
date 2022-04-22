package day1_keep_all_folders.March.day24_Different_Loop;

public class Remove_same_letter {
    public static void main(String[] args) {
        String word= "asdrtyuioplkjhasd";
        String word2 = "";
        for (int i = 0; i<word.length();i++){
            if(!word2.contains(""+word.charAt(i))){
                word2+=word.charAt(i);
            }
        }
        System.out.println("Non repeated:"+ word2);
    }
}
