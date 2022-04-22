package day1_keep_all_folders.homework.homeworkApril_4;

import java.util.ArrayList;

public class String_numbers_to_sum {
    public static ArrayList<Integer> string_numbers_to_sum(String[] numbers) {
        ArrayList<Integer> sumNum = new ArrayList<>();
        for (String each : numbers) {
            int sum = getAnInt( each );
            sumNum.add( sum );

        }
        return (sumNum);
    }

    private static int getAnInt(String each) {
        int sum = 0;
        for (int i = 0; i < each.length(); i++) {
            int newNumber = Integer.parseInt( String.valueOf( each.charAt( i ) ) );
            sum += newNumber;
        }
        return sum;
    }

    public static ArrayList<Integer> string_numbers_to_sum1(String[] numbers) {
        ArrayList<Integer> sumNum = new ArrayList<>();
        for (String each : numbers) {
            int sum = getSum( String.valueOf( each ) );
            sumNum.add( sum );
        }
        return (sumNum);
    }

    private static int getSum(String each) {
        int sum = 0;
        for (String eachDigit : each.split( "" )) {
            sum += Integer.parseInt( eachDigit );
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] numbers = {"123", "34", "513"};
        System.out.println( string_numbers_to_sum( numbers ) );
        System.out.println( string_numbers_to_sum1( numbers ) );
    }
}
