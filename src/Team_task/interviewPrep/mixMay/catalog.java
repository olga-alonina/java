package Team_task.interviewPrep.mixMay;

public class catalog {
    public static void main(String[] args) {
        System.out.println( isSame( "catcatdog" ) );
        System.out.println( isSame( "catdogdog" ) );
        System.out.println(isSame( "catdog"));
        System.out.println(isSame( "cat"));
        System.out.println(isSame( "dog"));
        System.out.println(isSame( ""));
    }

    public static boolean isSame(String str) {
        boolean same = false;
        int dog = 0;
        int cat = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains( "cat" )) {
                str = str.replaceFirst( "cat", "" );
                cat++;
            }
            if (str.contains( "dog" )) {
                str = str.replaceFirst( "dog", "" );
                dog++;
            }

        }
        if (cat == dog) {
            same = true;
        }
        return same;
    }
}
    /*Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true*/

