package day1_keep_all_folders.May.May31_day64_functional_Interface;

import day1_keep_all_folders.May.May28_day63_functional_interface.Homework.Function;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {
        Predicate<Integer> verifyDuplicates = n -> {
            String str = n + "";
            String[] temp = str.split( "" );
            TreeSet<String> treeSet = new TreeSet<>( Arrays.asList( temp ) );
            if (treeSet.size() < temp.length) {
                return true;
            } else {
                return false;
            }
        };
      Function<List<String>,String>longest_String_From_List = list->{
            String longest = "";
            for(String each:list){
                if(each.length()>longest.length()){
                    longest= each;
                }
            }
            System.out.println( "longest = " + longest );
        };
        //examples
        longest_String_From_List.apply( Arrays.asList( "Ola","Catrin","kapicabra","watermelon" ) );
        System.out.println( "verify Duplicates  = " + verifyDuplicates.test( 123123 ) );
    }
}
