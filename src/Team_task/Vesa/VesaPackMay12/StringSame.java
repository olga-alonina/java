package Team_task.Vesa.VesaPackMay12;

public class StringSame {
    /*Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:*/
    public static boolean sameLetters(String str1, String str2) {
        //return false or true thats mean return type is boolean
        // 1.declare checker amount of same letters
        int count = 0;
        //2 check what size of 2 string is same
        if (str1.length() == str2.length()) {
            //going through 1 string
            for (int i = 0; i < str1.length(); i++) {
            /*check that 2 string contain letters of 1 string. with each iteration
             it will check how many letters from 1 string is actually contain 2 string */
                if (str2.contains( "" + str1.charAt( i ) )) {
                    //if we find match result we raise counter
                    count++;
                }
            }
            //on order to have true result counter should be raised same amount of times as size of 1 string
            if (count == str1.length()) {
                return true;
            }
        }//other cases: if they have different size or not match we return false
        return false;
    }

    public static void main(String[] args) {
        System.out.println( sameLetters( "abca", "cab" ) );// true
        System.out.println( sameLetters( "abc", "abb" ) );//false
    }
}
