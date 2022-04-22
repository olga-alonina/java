package day1_keep_all_folders.homework.homeworkMarch5;

public class Biggest_Substring {
    public static void main(String[] args) {
        String sent = "aaabbbcccccddddeeeeeeehhhhhhhhhhhhhhhhhhhhhhh";
        String counter = "";
        char c = sent.charAt(0);//5a
        String counter2 = ("");//7
        String result = "";

        for (int k = 0; k < sent.length(); k++) {

            if (c == sent.charAt(k)) {
                counter += c;
            } else {
                 if (counter2.length() < counter.length()) {
                    counter2 = counter;
                }
                c = sent.charAt(k);
                counter = "" + c;

            }
        }
        if (counter2.length() < counter.length()) {
            counter2 = counter;
        }
        System.out.println("counter2 " + counter2);

    }
}











