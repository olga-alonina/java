package day1_keep_all_folders.homework.homeworkMarch21;

public class Have_or_Not {
    public static void contain_Number(int a, int[] array) {
        boolean hasNumber = false;
        for (int numbers : array) {
            if (numbers == a) {
                hasNumber = true;
            }
        }
        System.out.println(hasNumber);
    }
    public static void main(String[] args) {
        int[] array = {6, 8, 9, 15};
        contain_Number(8, array);
    }
}
