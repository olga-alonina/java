package day1_keep_all_folders.homework.homeworkApril_4;

import java.util.ArrayList;

public class Remove_Bad_Pair {
    public static ArrayList<Integer> remove_Bad_Pair(int[] numb) {
        ArrayList<Integer> without_B_P = new ArrayList<>();
        for (int i = 0; i < numb.length - 1; i += 2) {
            if (numb[i] < numb[i + 1]) {//01 23 45 67
                without_B_P.add( numb[i] );
                without_B_P.add( numb[i + 1] );
            }
        }
        return (without_B_P);
    }

    public static void main(String[] args) {
        int[] numb = {3, 4, 6, 1, 1, 10, 8, 7};
        System.out.println( remove_Bad_Pair( numb ) );
    }
}
