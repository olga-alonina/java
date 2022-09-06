package OH.OH_1_12;

import java.util.Arrays;

public class right_to_left {
    public static void main(String[] args) {
        int []x = {1,2,3,6,9,8,5,12,12,23,45};
        int [] newX = new int[x.length];

        for (int i=0; i<x.length;i++) {
           newX[i]=x[x.length-i-1];

        }
        System.out.println(Arrays.toString(newX));
    }
}
