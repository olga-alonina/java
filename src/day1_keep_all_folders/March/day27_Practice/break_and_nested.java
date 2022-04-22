package day1_keep_all_folders.March.day27_Practice;

public class break_and_nested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("index " + i);
            // if (i == 1||i==2) {continue;            //skip index 1 or 2
            //if(i==3){ break;              //stop inner loop in numb 3
            // }
            for (int j = 0; j < 2; j++) {
                 // if (j == 1) {
                // continue;
               // }
                System.out.println("j " + j);
            }


        }
    }
}

