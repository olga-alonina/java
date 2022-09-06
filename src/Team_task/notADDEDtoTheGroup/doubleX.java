package Team_task.notADDEDtoTheGroup;

public class doubleX {
    /*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true*/
    public static boolean doubleX(String str) {
        boolean doubleX = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt( i ) == 'x' && str.charAt( i + 1 ) != 'x') {
                doubleX = false;
                break;
            } else if (str.charAt( i ) == 'x' && str.charAt( i + 1 ) == 'x') {
                doubleX = true;
                break;
            }
        }
        return doubleX;
    }

    public static void main(String[] args) {
        System.out.println( doubleX( "axxbb" ) );
        System.out.println( doubleX( "axaxax" ) );
        System.out.println( doubleX( "xxxxx" ) );
    }

}
