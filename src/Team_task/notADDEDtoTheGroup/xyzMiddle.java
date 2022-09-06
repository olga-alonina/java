package Team_task.notADDEDtoTheGroup;

public class xyzMiddle {
    /*
Given a string, does "xyz" appear in the middle of the string? To define middle,
we'll say that the number of chars to the left and right of the "xyz" must differ
by at most one. This problem is harder than it looks.
xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false*/
    public static boolean xyzMiddle(String str) {

        //1 assign value to MID
        int mid = str.length() / 2;
        //2 check what word size is bigger than 3
        if (str.length() < 3) {
            //result of step2
            return false;
        }
        //3 verify that word has odd amount of letters
        if (str.length() % 2 != 0) {
            //4 verify what our middle letter is y
            if (str.charAt( mid ) == 'y') {
                //5 verify connected condition with step 4
                if (str.charAt( mid - 1 ) == 'x' && str.charAt( mid + 1 ) == 'z') {
                    //result of the steps 4 and 5
                    return true;
                }
            }
            //6 verify that word has even amount of letters
        } else {
            // 7 verify middle 3 letters
            if (str.charAt( mid - 2 ) == 'x'  &&  str.charAt( mid - 1 ) == 'y'  &&  str.charAt( mid ) == 'z') {
                return true;
            }
            //8 verify middle 3 letters
            if (str.charAt( mid - 1 ) == 'x'  && str.charAt( mid ) == 'y'  &&  str.charAt( mid + 1 ) == 'z') {
                return true;
            }
            //9 verify middle 3 letters
            if (str.charAt( mid ) == 'x' && str.charAt( mid + 1 ) == 'y' && str.charAt( mid + 2 ) == 'z') {
                return true;
            }
        }
        //10 return
        return false;
    }

    public static boolean containXYZ(String word) {
        boolean result = false;//1
        //conditon 1
        if (word.length() < 3) {//
            System.out.println( "word too short for " );

        } else if (word.length() == 3 && word.equalsIgnoreCase( "xyz" )) {
            result = true;

            //condition 3
        } else if (word.substring( word.length() / 2 - 2, word.length() / 2 + 2 ).contains( "xyz" )) {
            System.out.println( "word contains \"xyz\"" );
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println( containXYZ( "xyz" ) );//true
        System.out.println( containXYZ( "" ) );//true
        System.out.println( "*************" );


        System.out.println( xyzMiddle( "AxyzBBB" ) );//false
        System.out.println( xyzMiddle( "xyzAxyzBBB" ) );// true
        System.out.println( "***********************" );
        System.out.println( xyzMiddle( "xyzAxyzBxyz" ) ); //true
        System.out.println( xyzMiddle( "xyzxyzAxyzBxyzxyz" ) );// true
        System.out.println( xyzMiddle( "xyzxyzxyzBxyzxyz" ) );//true
        System.out.println( xyzMiddle( "xyzxyzAxyzxyzxyz" ) );//true
        System.out.println( xyzMiddle( "xyzxyzAxyzxyzxy" ) ); //false
    }
}
