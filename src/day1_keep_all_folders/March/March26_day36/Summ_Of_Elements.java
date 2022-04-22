package day1_keep_all_folders.March.March26_day36;

public class Summ_Of_Elements {
    public static int sum(int...arr) {//... and int[]arr IS SAME
        int sum = 0;
        for (int each : arr) {
            sum += each;
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr = {1,5,6,5,8,5};
        System.out.println(sum(arr));
        System.out.println(sum(2,6,5,89,5,8,5));
    }
}
