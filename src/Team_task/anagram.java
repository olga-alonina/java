package Team_task;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String result = "";
        String one = "listen";
        String two = "silent";
        char[] a = one.toCharArray();
        char[] b = two.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            result = "its anagram";
        } else {
            result = "Try again";
        }
        System.out.println(result);
    }
}
