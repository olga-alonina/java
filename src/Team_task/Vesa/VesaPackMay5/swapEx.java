package Team_task.Vesa.VesaPackMay5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swapEx {
    /*Swap two variable' values without using a third variable*/
    public static void swapEx(ArrayList<Integer> list, int a, int b) {
        int indA = list.indexOf( a );
        int indB = list.indexOf( b );
        Collections.swap( list,  indA , indB);
        System.out.println("Arraylist=>"+ list );
    }

    public static void swapEx(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("temp place=>"+ a + " " + b );
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList( 1, 85, 79, 48 ) );
        swapEx( list, 85, 79 );
        swapEx(85, 79 );
    }
}
