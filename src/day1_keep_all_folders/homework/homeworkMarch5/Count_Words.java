package day1_keep_all_folders.homework.homeworkMarch5;

public class Count_Words {
    public static void main(String[] args) {

        String senten = "This has multiple words";//1)dec String sen(0,5,9,18  0+5, 5+4,
        //               012345678901234567890123
        int counter = 0;//2)make counter

        for (int i = 0; i < senten.length(); i++) {
            if (senten.charAt(i) == ' ') {
                counter++;
            }
        }
        System.out.println("Count " + (counter+1));
    }
}



