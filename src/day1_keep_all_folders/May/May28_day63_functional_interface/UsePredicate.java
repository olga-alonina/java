package day1_keep_all_folders.May.May28_day63_functional_interface;

import java.util.function.Predicate;

public class UsePredicate {
    public static Predicate<String> isPalindrome = str -> {
        String reverse = new StringBuilder( str ).reverse().toString();
        return str.equals( reverse );
    };
    public static Predicate<Integer>isPrime = n->{

        if(n == 0 || n == 1) return false;

        for(int i = 2; i < n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    };
}

