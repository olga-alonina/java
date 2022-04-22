package day1_keep_all_folders.March.day25and26Recap;

public class Frequency_of_Character {
    public static void main(String[] args) {

        String a = "apple";
        String checked = "";
        for (int i = 0; i < a.length(); i++) {
            int counter = 0;
            char let = a.charAt(i);
            if(checked.contains(""+let)){
                continue;
            }
            for (int w = 0; w < a.length(); w++) {
                char eachLetter = a.charAt(w);
                if (let == eachLetter) {
                    counter++;

                }
            }
            System.out.println(let + " - " + counter);
            checked+=let;
        }
    }
}



