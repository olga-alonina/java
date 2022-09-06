package Team_task.Vesa.VesaPackMay19;

import java.util.*;

public class Sort_Ascending_and_Descending {
    /* Write a return method that can sort an int array in Ascending
     order without using the sort method of the Arrays class
     Ex:     int[] arr = {10, 9, 8, 7};     arr = Sort(arr); ==>{ 7, 8, 9, 10};*/
    public static void sort_Ascending(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr.length - 1;
        int[] newArr = new int[arr.length];
        for (int each : arr) {
            list.add( each );
        }
        do {
            Integer max = Collections.max( list );
            newArr[i] = max;
            list.remove( max );
            --i;
        } while (!list.isEmpty());
        System.out.println( Arrays.toString( newArr ) );
    }

    public static void sort_Ascending2(int[] arr) {
        Set<Integer> list = new TreeSet<>();
        for (int each : arr) {
            list.add( each );
        }
        System.out.println(list);
    }

    public static void sort_Descending(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr.length - 1;
        int[] newArr = new int[arr.length];
        for (int each : arr) {
            list.add( each );
        }
        do {
            Integer min = Collections.min( list );
            newArr[i] = min;
            list.remove( min );
            --i;
        } while (!list.isEmpty());
        System.out.println( Arrays.toString( newArr ) );
    }

    public static void main(String[] args) {
        int[] arr = {10, 6, 4, 7};
        sort_Ascending( arr );
        sort_Ascending2( arr );
        int[] arr1 = {10, 20, 7, 8, 90};
        sort_Descending( arr1 );
    }
}

