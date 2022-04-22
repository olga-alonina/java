package day1_keep_all_folders.March.day24_Different_Loop;

public class BranchingExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("***********");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            break;

        }
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            continue;
        }
        System.out.println("***********");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }

}
