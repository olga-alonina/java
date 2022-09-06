package Extra_Tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Q19_ArrayList_sort {
    public static void main(String[] args) {
    /*19. Write a Java program to get the index of all the characters of the alphabet. Go to the editor
 String str = "The quick brown fox jumps over the lazy Dog.";*/
        ArrayList<String> alph = new ArrayList<>();
        String str = "The quick brown fox jumps over the lazy Dog";
        int size = str.length();
        int count = 1;
        String st = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt( i ) == ' ') {
                count++;
            } else {
                st += str.charAt( i );
                st += count;
                alph.add( st );
                count++;
                st = "";
            }
        }
        Collections.sort( alph );
        System.out.println( alph );
    }
}
