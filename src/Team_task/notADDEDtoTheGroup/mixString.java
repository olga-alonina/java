package Team_task.notADDEDtoTheGroup;

public class mixString {

    /*Given two strings, a and b, create a bigger string made of the first char of a,
     the first char of b, the second char of a, the second char of b, and so on.
      Any leftover chars go at the end of the result.
    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"*/
    public static String mixString(String a, String b) {
        String mixString = "";
        while (!a.isEmpty() && !b.isEmpty()) {
            mixString += "" + a.charAt( 0 ) + "" + b.charAt( 0 );
            a = a.substring( 1, a.length() );
            b = b.substring( 1, b.length() );
        }

        if (a.isEmpty()) {
            mixString += b;
        }
        if (b.isEmpty()) {
            mixString += a;
        }
        return mixString;
}

    public static void main(String[] args) {
          System.out.println( mixString( "abc", "xyz" ) );
        System.out.println( mixString( "Hi", "There" ) );
        System.out.println( mixString( "xxxx", "There" ) );
        System.out.println( mixString( "", "Hello" ) );
    }
}
