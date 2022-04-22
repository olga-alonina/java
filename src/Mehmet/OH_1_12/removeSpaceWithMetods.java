package Mehmet.OH_1_12;

import java.util.Arrays;

public class removeSpaceWithMetods {
    public static void remove_space(String str) {
        /* Write a method that can remove  all extra space from String*/
        /* Input: "  Hello world      I      love      Java    "
       	     Output: Hello world I love Java*/
        str = str.trim();
        int count = 0;

        for (int i = 10; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
            str = str.replace("  ", " ");
        }
        System.out.println(str);
        System.out.println("other solution \n*******************");
        String[] s = str.trim().split(" ");
        System.out.println(Arrays.toString(s));
        // System.out.println(s[2].length());  to see we have empty String
        String result = "";
        for (String each : s) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        remove_space(" Hello world      I      love      Java    ");
    }
}
