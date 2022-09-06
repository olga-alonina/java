package Extra_Tasks;

import java.util.Arrays;

public class Q16getBytes_getChars {
    public static void main(String[] args) {
        //16. Write a Java program to get the contents of a given string as a byte array. G

        String oma = "The new String equals";
        byte[] oma1 = oma.getBytes();
        String repl = "";
        for (int i = 0; i < oma1.length; i++) {
            if (oma1[i] < 100) {
                repl += "*";
            } else {
                repl += oma.charAt( i );

            }
        }

        System.out.println( "oma1 " + Arrays.toString( oma1 ) );
        System.out.println( "Repl " + repl );
        String oma3 = new String( oma1 );
        System.out.println( "Result " + oma3 );
        System.out.println( "**********my thoughts**********" );
        char[] oma2 = new char[9];
        oma.getChars( 1, 10, oma2, 0 );
        String oma4 = new String( oma2 );
        System.out.println( "Result thoughts= " + oma4 );
    }
}

