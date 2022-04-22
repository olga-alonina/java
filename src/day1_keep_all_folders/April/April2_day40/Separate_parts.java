package day1_keep_all_folders.April.April2_day40;

import java.util.ArrayList;
import java.util.Arrays;

public class Separate_parts {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<String>list = new ArrayList<>( Arrays.asList(str.split( "" )));
        System.out.println( "list = " + list );
        ArrayList<String>numbers = new ArrayList<>(list);
        numbers.retainAll( Arrays.asList( "1","2","3","4","5","6","7","8","9","0" ) );
        System.out.println( "numbers = " + numbers );
        System.out.println("*************");
        ArrayList<String>spCharacters = new ArrayList<>(list);
        spCharacters.retainAll( Arrays.asList( "!","@","#","$","%","^","&","*","(",")" ,"~") );
        System.out.println( "spCharacters = " + spCharacters );
        System.out.println("*************");
        ArrayList<String>letters = new ArrayList<>(list);
        letters.removeAll( numbers );
        letters.removeAll( spCharacters );
        System.out.println( "letters = " + letters );
    }
}
