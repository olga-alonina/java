package Team_task.Vesa.VesaPackMay26;

import java.util.ArrayList;

public class Move_Zeros_to_the_End {
    //    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//    Ex:
//    input:  {1,0,2,0,3,0,4,0};
//    output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void move_Zeros_to_the_End(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer each : arr) {
            if (each != 0) {
                list.add( each );
            }
        }
        while (list.size() != arr.length - 1) {
            list.add( 0 );
        }
        System.out.println( list );
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        move_Zeros_to_the_End( arr );
    }
}
