package day1_keep_all_folders.March.day23LoopAgain;

public class print_Each_Char {
    public static void main(String[] args) {
        String a = "java";
        /*System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));*/

        for (int i = a.length()-1; i >=0; i--){
        System.out.println(a.charAt(i));
    }
}}
