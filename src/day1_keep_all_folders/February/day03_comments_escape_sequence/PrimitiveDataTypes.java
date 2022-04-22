package day1_keep_all_folders.February.day03_comments_escape_sequence;

public class PrimitiveDataTypes {
    public static void main(String[] args){

        //Integer: age, year, salary, miles
        byte age = 34;
        short year = 2022;
        int salary = 89000;//prefered
        long miles = 100000000L;

        //Decimals: tax, pi
        double tax = 0.26;
        float pi = 3.14F;

        //symbols: @,#
        char ch1 = '@';
        char ch2 = '#';

        System.out.println(age);
        System.out.println(year);
        System.out.println(salary);
        System.out.println(miles);
        System.out.println(tax);
        System.out.println(pi);
        System.out.println("_____________________________");

        boolean result1 = true;
        boolean result2 = false;
        boolean result3 = 5 > 10;
        System.out.println(result3);

        int a =100;
        int b = 200;
        boolean aIsGreaterThanb = a > b;
        System.out.println(aIsGreaterThanb);

    }
}
