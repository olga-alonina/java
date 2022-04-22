package day1_keep_all_folders.March.day22Loop;

public class count_letters {
    public static void main(String[] args) {
        String word = "abracadabra";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        System.out.println("Number of letter a is " + count);


    String word2 = "abracavvvccccdabra";
    char letter = 'c';
        int count2 = 0;
    for (int i = 0; i < word2.length(); i++) {

        if(word.charAt(i) ==letter){
            count2++;
        }
    }
}
}