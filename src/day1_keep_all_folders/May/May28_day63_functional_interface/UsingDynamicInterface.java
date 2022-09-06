package day1_keep_all_folders.May.May28_day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        DynamicInterface<String> printEachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.print( str.charAt( i ) );
            }
        };
        printEachChar.test( "Alonina Olga" );
        DynamicInterface<Integer> printNumber5Times = n -> {
            for (int i = 0; i < 5; i++) {
                System.out.print( n );

            }
        };printNumber5Times.test( 25 );
    }
}
