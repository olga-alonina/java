package day1_keep_all_folders.March.day25and26Recap;

public class Nested_loop_ex2 {
    public static void main(String[] args) {
        for (int num2 = 0; num2 < 5; num2++) {
            System.out.print("A" + num2);
            for (int num3 = 1; num3 < num2; num3++) {
                System.out.print("B" + num3);
            }
            System.out.println();
            System.out.println("*******************");
            String str = "java";
            for (int w = 0; w < str.length(); w++) {
                for (int q = 0; q <= w; q++) {
                    System.out.print(str.charAt(q));

                }
                System.out.println();
            }
        }
    }
}
