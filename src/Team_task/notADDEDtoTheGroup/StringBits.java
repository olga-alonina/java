package Team_task.notADDEDtoTheGroup;

public class StringBits {
    /*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"*/
    public static String stringBits(String str) {
        String stringBits = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                stringBits += str.charAt( i );
            }
        }
        return stringBits;
    }

    public static void main(String[] args) {
        System.out.println( stringBits( "Hello" ) );
        System.out.println( stringBits( "Hi" ) );
        System.out.println( stringBits( "Heeololeo" ) );
    }

}
