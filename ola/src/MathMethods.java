package src;


import java.util.ArrayList;

public class MathMethods {
    public static int Count_Words(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max( max, sentences[i].split( " " ).length );
        }
        //  String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        return max;
    }

    public static ArrayList<String> replace_L_to_stars(String[] sentences) {
        String pass = "";
        String temp = "";
        ArrayList<String> list = new ArrayList<>();

        extracted( sentences, pass, list );
        return list;
    }

    public static void extracted(String[] sentences, String pass, ArrayList<String> list) {
        String temp;
        for (int i = 0; i < sentences.length; i++) {
            temp = "";
            pass = getString( pass, sentences[i] );
            temp += pass;
            list.add( temp );
            pass = "";
        }
    }

    public static String getString(String pass, String sentences) {
        for (int j = 0; j < sentences.length(); j++) {
            char c = sentences.charAt( j );
            if (c != ' ') {
                pass += "*";
            } else {
                pass += " ";
            }
        }
        return pass;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println( Count_Words( sentences ) );
        System.out.println( replace_L_to_stars( sentences ) );
    }
}
