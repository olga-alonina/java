package day1_keep_all_folders.March.day25and26Recap;

public class multiplication_table {
    public static void main(String[] args) {

        for (int num = 1; num < 10; num++) {
            System.out.println(num + " x 1 = " + (num * 1));
        }
        System.out.println("");
        for (int num = 1; num < 10; num++) {
            System.out.println(num + " x 2 = " + (num * 2));
        }
        System.out.println("*****************");
        for (int num2 = 1; num2 < 10; num2++) {

            for (int multi = 1; multi < 10; multi++) {
                System.out.print("\t"+num2 + " x " + multi + " = " + (num2 * multi) + "|\t");
            }
            System.out.println();
        }
    }
}
