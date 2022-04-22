package day1_keep_all_folders.homework.homeworkMarch21;

public class Odd_and_Even_1To100 {
    public static void oddNumbers1to100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void evenNumbers1to100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        oddNumbers1to100();
        System.out.println();
        evenNumbers1to100();
    }
}