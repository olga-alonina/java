package OH.OH_13_14;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static ArrayList<Integer> fibonacci(Integer number) {
        ArrayList<Integer> line = new ArrayList<>(number);
        int count = 0;
        Integer nextElement = 0;
        line.add(nextElement);
        line.add((nextElement + 1));
        //0, 1, 1, 2, 3, 5, 8, 13, 21

        do {
            for (int j = 1; j < 8; j++) {
                line.add(line.get(j) + line.get(j - 1));
                count++;

            }
        }
        while (count == number);
        return line;
    }

    public static void fibonacciArray(int number) {
        // Check_Six solution

        int[] fibo = new int[number + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println(Arrays.toString(fibo));
    }



    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
