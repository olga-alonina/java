package day1_keep_all_folders.March.day24_Different_Loop;

public class syllables {
    public static void main(String[] args) {
        String sent = "ja-va";
        int counter = 1;


        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == '-') {
                counter++;
            }
        }
        System.out.println("Syllables: " + (counter));
    }
}

