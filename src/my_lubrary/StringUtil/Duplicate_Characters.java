package my_lubrary.StringUtil;

import static my_lubrary.StringUtil.Frequency_of_Character.frequency_of_Character;

public class Duplicate_Characters {
    public static void main(String[] args) {
        System.out.println(duplicate_Characters("aaaaabcccdeeff"));
        System.out.println("*********");
        System.out.println(duplicate_Characters1("aaaaabcccdeeff"));
    }

    public static String duplicate_Characters(String name) {
        String duplicate = "";
        for (int j = 0; j < name.length(); j++) {
            int i = frequency_of_Character(name, name.charAt(j));
            if ((i) > 1) {
                duplicate += name.charAt(j);
                name = name.replace(name.charAt(j), ' ');
            }
        }
        duplicate = duplicate.replace(" ","");
        return duplicate;
    }
    public static String duplicate_Characters1(String str) {
        String duplicate = "";
        for (int j = 0; j < str.length()-1; j++) {
            if (str.charAt(j) == str.charAt(j+1)) {
                duplicate += str.charAt(j);
                str = str.replace(str.charAt(j), ' ');
            }
        }duplicate = duplicate.replace(" ","");
        return duplicate;
    }
}



