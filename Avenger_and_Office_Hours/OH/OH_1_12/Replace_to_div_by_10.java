package OH.OH_1_12;

import java.util.Arrays;

public class Replace_to_div_by_10 {
    public static void main(String[] args) {
        int[] newArray = {5, 4, 40, 1, 60, 2, 30, 34, 70, 43, 2, 80, 67};
        //            0  1   2  3  4   5   6  7   8    9  10 11  12
        for (int i = 0; i <= newArray.length - 2; i++) {
            if (newArray[i] % 10 == 0) {
                if (newArray[i + 1] % 10 == 0) {
                    newArray[i + 1] = newArray[i + 1];
                } else {
                    newArray[i + 1] = newArray[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}