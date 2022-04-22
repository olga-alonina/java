package Team_task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Random_Numbers_sumToZero {
    public static void fillUpToNMinusOne(Integer n, ArrayList<Integer> a) {
        Random r = new Random();
        for (int i = 0; i < n - 1; i++) {
            int k = 0;
            do {
                k = r.nextInt(2000)-1000;
            }
            while (a.contains(k));
            a.add(k);

        }
    }

    public static void calculateN(Integer n, ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        a.add(-sum);

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (1-100)");
        int n = input.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        fillUpToNMinusOne(n, a);
        calculateN(n, a);
        System.out.println("a = " + a);
    }
}
