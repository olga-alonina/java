package day1_keep_all_folders.homework.homeworkMarch21;

public class Sum_Of_Array {
    public static void summ_Array(int[] array) {
        // Create a method that accept an int array. Take the sum of all the numbers and print the result
        int summ = 0;
        for (int numbers : array) {
            summ += numbers;
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 5, 25, 78, 55, 75, 5, 8, 6, 9};
        summ_Array(array);
    }
}
