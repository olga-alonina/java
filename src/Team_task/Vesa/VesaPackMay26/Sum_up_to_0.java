package Team_task.Vesa.VesaPackMay26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sum_up_to_0 {
    //    1) Array - N unique integers that sum up to 0
//Write a function that, given an integer N (1 <N < 100), returns an array
// containing N unique integers that sum up to 0. The function can return
// any such array. For example, given N = 4, the function could return [1,0, -3,2] or
// [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
// For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
    public static String sum_Up_To_Zero(int N) {

        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = i;
            sum += i;
        }
        arr[arr.length - 1] = -sum;
        return Arrays.toString( arr );

    }
 //"different solution/hard but interesting");
    public static void fillUpToNMinusOne(Integer n, ArrayList<Integer> a) {

        Random r = new Random();
        for (int i = 0; i < n - 1; i++) {
            int k = 0;
            do {
                k = r.nextInt( 2000 ) - 1000;
            }
            while (a.contains( k ));
            a.add( k );

        }
    }

    public static void calculateN(Integer n, ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get( i );
        }
        a.add( -sum );

    }


    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        System.out.println( "Enter n (1-100)" );
        int n = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        fillUpToNMinusOne( n, a );
        calculateN( n, a );
        System.out.println( "a = " + a );
    }
}

/*3) Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

4) Array - Concat two arrays
Write a return method that can concate two arrays
*/

