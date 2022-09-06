package Team_task.interviewPrep.mixApril;

import java.util.ArrayList;
import java.util.Collections;

public class Task_19 {
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
                if (!alph.contains( "" + str.charAt( i ) )) {
                    st += str.charAt( i );
                    st += count;
                    alph.add( st );
                    count++;
                    st = "";
                }

            }
        }
        Collections.sort( alph );
        System.out.println( alph );
    }
}
