package Extra_Tasks;

public class Q24_ReplaceChar {
    public static void main(String[] args) {
        /*
24. Write a Java program to replace a specified character with another character. Go to the editor
Sample Output:

Original string: The quick brown fox jumps over the lazy Dog.
New String: The quick brown fox jumps over the lazy fog.
         */

        String str = "The quick brown fox jumps over the lazy Dog";

        char specifiedChar = 'd';
        char replacedChar = 'f';

        System.out.println(str.replace(specifiedChar, replacedChar));

    }
}
