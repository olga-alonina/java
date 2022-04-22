package my_lubrary.StringUtil;

public class Frequency_of_Character {
    public static void main(String[] args) {
        System.out.println( frequency_of_Character( "apple", 'p' ) );
        System.out.println( frequency_of_Character( "aabbaacca", 'a' ) );

    }

    public static int frequency_of_Character(String name, char letter) {
        /*create a method that will accept a word(String) and a letter (char)
and return how many times that given letter is found in the given word*/
        /*

Ex:
	Input:
		apple, p

	Output:
		2*/
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt( i ) == letter) {
                count++;
            }

        }
        return count;
    }

}