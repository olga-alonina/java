package Team_task.notADDEDtoTheGroup;

public class countBob {
/*    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false*/
public static boolean bobThere(String str) {
    if (!str.contains( "b" ) || str.length() < 3) {
        return false;
    }
    for (int i = 0; i <= str.length()-3; i++) {
        if (str.charAt( i ) == 'b' && str.charAt( i + 2 ) == 'b') {
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
        System.out.println( bobThere( "abcbob" ) ); //true
        System.out.println( bobThere( "b9b" ) );//true
        System.out.println( bobThere( "bac" ) );// false
    }
}
