package day1_keep_all_folders.May.May28_day63_functional_interface;

public class CallPredicateMethods {

    public static void main(String[] args) {
        System.out.println( UsePredicate.isPalindrome.test( "racecar" ) );
        //2variant
        boolean result = UsePredicate.isPalindrome.test( "acx" );
        System.out.println( "result = " + result );
        System.out.println( UsePredicate.isPrime.test( 5 ) );
        System.out.println( UsePredicate.isPrime.test( 16 ) );
    }
}

