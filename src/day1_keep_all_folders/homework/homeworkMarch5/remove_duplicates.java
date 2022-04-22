package day1_keep_all_folders.homework.homeworkMarch5;

public class remove_duplicates {
    public static void main(String[] args) {

        String sent = "abcvjshdgfabc";
//                     01234567890
        String sent2 = "";

        for (int i =0 ; i < sent.length(); i++) {
            if (!sent2.contains(sent.substring(i,i+1))) {
              sent2+=sent.charAt(i);
            }
        }
        System.out.println(sent2);

    }
}
