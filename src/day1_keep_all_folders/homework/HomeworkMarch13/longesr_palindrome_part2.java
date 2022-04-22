package day1_keep_all_folders.homework.HomeworkMarch13;

public class longesr_palindrome_part2 {
    public static void main(String[] args) {

        String[] word = /*{"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};*/
                {"abc", "dna", "kevin", "joe", "lamp"};

        String longest = "";
        for (String eachWord : word) {
            boolean isPalindrome = true;
            for (int k = 0; k < eachWord.length()/2; k++) {
                if (eachWord.charAt(k) != eachWord.charAt(eachWord.length() - 1) - k) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && eachWord.length() > longest.length()) {
                longest = eachWord;
            }
        }
        System.out.println(longest.isEmpty()?"no Palindrome": longest);
    }
}
