package AH.June6;

import java.util.*;

public class Reverse_String_dataSTR {
    public static String reversedDSR(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt( i );
        }
        return reversed;
    }

    public static String reversedDSR1(String str) {
        List<String> list = new ArrayList<>( Arrays.asList( str.split( "" ) ) );
        String reversed = "";
        Collections.reverse( list );
        reversed = list.toString().replace( "[", "" ).replace( "]", "" )
                .replace( ", ", "" );
        return reversed;
    }

    public static String reversedDSR2(String str) {
        String reversed = "";
        Stack<String> stack = new Stack<>();
        stack.addAll( Arrays.asList( str.split( "" ) ) );
        for (int i = 0; i < str.length(); i++) {
            reversed += stack.pop();
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println( reversedDSR( "Olaaa" ) );
        System.out.println( reversedDSR1( "Olaaa" ) );
        System.out.println( reversedDSR2( "Olaaa" ) );
    }
}
