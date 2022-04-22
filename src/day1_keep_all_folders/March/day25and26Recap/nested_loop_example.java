package day1_keep_all_folders.March.day25and26Recap;

public class nested_loop_example {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word");
        }
        System.out.println("Hello Universe\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word");
        }
        System.out.println("Hello Universe\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word");
        }
        System.out.println("Hello Universe\n");
        System.out.println("-------------");
        for (int j=0;j<3;j++){
            for (int i = 0; i < 5; i++) {
                System.out.println("***Hello word****");
            }
            System.out.println("Hello Universe");
        }
    }
}

