package my_lubrary.StringUtil;

public class reverse {
     /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
