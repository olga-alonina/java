package my_lubrary.ArrayUtil;

public class Contains {
    /*create a method that will accept an int array and an int number.
 Check and return if the given number is in the array.
     */
    public static void main(String[] args) {
        System.out.println(contains1(new int[]{1, 63, 4, 6, 6, 8, 9, 6}, 6));
        System.out.println("*****************");
        System.out.println(contains(new int[]{1, 63, 4, 6, 6, 8, 9, 6}, 6));
    }

    public static int contains1(int[] arr, int number) {
        int how_often = 0;
        for (int numbers : arr) {
            if (numbers == number) {
                how_often++;
            }
        }
        return how_often;
    }public static boolean contains(int[] arr, int number) {
       boolean contain = false;
        for (int numbers : arr) {
            if (numbers == number) {
               return true;
            }
        }
        return false;
}}
