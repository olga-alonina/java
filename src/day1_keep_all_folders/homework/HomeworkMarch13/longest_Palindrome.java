package day1_keep_all_folders.homework.HomeworkMarch13;

public class longest_Palindrome {
    public static void main(String[] args) {
        String[] word = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
              /*  {"abc", "dna", "kevin", "joe", "lamp"};*/
        String[] reversed = {"", "", "", "", "", "", ""};
        String longest = word[0];
        int count = 0;
        for (int k = 0; k < word.length/2; k++) {

            for (int i = word[k].length() - 1; i >= 0; i--) {
                reversed[k] += word[k].charAt(i);
            }
            if (reversed[k].equals(word[k]) && reversed[k].length() > longest.length()) {
                longest = reversed[k];
                count++;
            }

        }
        if (count > 0) {
            System.out.println(longest);
        } else {
            System.out.println("No palindrome");
        }
    }
}
