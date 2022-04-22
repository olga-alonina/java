package day1_keep_all_folders.March.day19_StringMetods;

public class CharMetods {
    public static void main(String[] args) {
        String s = "java";
        //          0123
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        /* System.out.println(s.charAt(4)); system eror*/
        int lastIndex = s.length()-1;
        System.out.println("Last char: "+s.charAt(lastIndex));
        int secondLastIndex = s.length()-2;
        char secondLastChar = s.charAt(secondLastIndex);
        System.out.println("second last char = " + secondLastChar);
    }
}
