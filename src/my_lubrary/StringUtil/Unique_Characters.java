package my_lubrary.StringUtil;

public class Unique_Characters {
    public static Frequency_of_Character StringUtil;

    public static void main(String[] args) {
        System.out.println(unique_Characters1("aaaaabcccdeeff"));
        System.out.println("**************");
        System.out.println(unique_Characters("aaaaabcccdeeff"));
    }

    public static String unique_Characters1(String str) {
        /*create a method that will accept a word(String) and return
 a String with all the unique characters. A character is
 unique if it only appears in the String once.

Hint: use your Frequency method to do some of the work*/
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;

    }

    public static String unique_Characters(String str) {
        /*create a method that will accept a word(String) and return
 a String with all the unique characters. A character is
 unique if it only appears in the String once.

Hint: use your Frequency method to do some of the work*/
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = Frequency_of_Character.frequency_of_Character(str, str.charAt(i));
            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;
    }
}



