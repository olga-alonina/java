package OH.OH_1_12;

import java.util.Arrays;

public class Six_to_Seven {
    public static void main(String[] args) {
    /*
            int[] x = {1,2,2} = > 5
            int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
            int[] a = {1,1,6,7,2} = > 4
            int[] b = {1,1,6,2} = > 2
            int[] c = {1,2,2,6,99,99,7,3,4} = > 12
            */
        int[] c = {1, 1, 6, 2};
        int[] newC = new int[c.length];
        int count = 0;

        for (int i = 0; i < newC.length; i++) {
            if (c[i] == 6) {
                newC[i] = 0;
                count++;
                continue;
            }
            if (c[i] == 7) {
                count--;
            } else {
                newC[i] = c[i];
            }
        }

        int summ = 0;
        for (int k = 0; k <= newC.length - 1; k++) {
            summ += newC[k];
        }
        System.out.println(summ);
        System.out.println(Arrays.toString(newC));
    }

}

