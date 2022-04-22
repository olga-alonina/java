package src;

import java.util.ArrayList;

public class password {
    public static void main(String[] args) {
        String temp = "";
        String total = "";
        String total1 = "";
        int count = 1;
        ArrayList<Integer> attempts = new ArrayList<>();


        ArrayList<String> list = new ArrayList<>();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        for (String each : sentences) {
            total = "";
            temp = "";

            for (int i = 0; i < each.length(); i++) {

                char c = each.charAt( i );
                if (c >= 'a' && c <= 'z') {
                    c = '*';
                }
                if (c == ' ') {
                    count++;
                }
                temp += c;//word from each sent(3)
            }
            total += temp + " ";//create sent from word 1by 1
            attempts.add( count );
            count = 1;
            list.add( total );
        }
        System.out.println( "attempts" + attempts );
        int max = attempts.get( 0 );
        for (int i = 0; i < attempts.size(); i++) {
            if (attempts.get( i ) > max) {
                max = attempts.get( i );
            }
        }
        System.out.println( "max = " + max );
        System.out.println( list );
    }
}





