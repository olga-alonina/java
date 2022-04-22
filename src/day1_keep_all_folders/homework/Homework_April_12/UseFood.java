package day1_keep_all_folders.homework.Homework_April_12;

import java.util.ArrayList;
import java.util.Arrays;

public class UseFood {
    public static void main(String[] args) {
        Food unit1 = new Food( "Apple" );
        System.out.println( "unit1 = " + unit1 );
        System.out.println( "*******name and quantity*******" );
        Food unit2 = new Food( "Banana", 6 );
        System.out.println( "unit2 = " + unit2 );
        System.out.println( "*******all*******" );
        Food unit3 = new Food( "Bread", 9, 1.25 );
        System.out.println( "unit3 = " + unit3 );
        System.out.println( "*******Start with \"a\" *******" );
        Food[] allFood = {unit1, unit2, unit3, null};
        allFood[3] = new Food( "Fish", 4, 3.55 );
        System.out.println( "allFood = " + Arrays.toString( allFood ) );
        String res = "";
        for (Food each : allFood) {
            if (each.name.startsWith( "A" )) {
                res += each + " | ";
            }
        }
        System.out.println( "res = " + res );
        System.out.println( "*******Total price over than 20 *******" );
        Food unit4 = new Food( "Apple", 12, 2.50 );
        Food unit5 = new Food( "Banana", 4, 0.99 );
        Food unit6 = new Food( "Milk", 10, 2.79 );
        Food unit7 = new Food( "Avocado", 2, 1.99 );
        Food unit8 = new Food( "Tomato", 6, 2.99 );
        ArrayList<Food> list2 = new ArrayList<>( Arrays.asList( unit3, unit4, unit5, unit6, unit7, unit8 ) );
        System.out.println( "list2 = " + list2 );
        String res2 = "";
        double total = 0;
        for (Food each : list2) {
            if (each.total_Price > 20) {
                res2 += each.name + "|";
            }
            total += each.total_Price;

        }
        System.out.println( "res2 = " + res2 );
        System.out.println( "My final payment will be" + total );
    }
}