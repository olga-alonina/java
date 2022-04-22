package day1_keep_all_folders.homework.HomeworkMarch13;

import java.util.Scanner;

public class averege_with_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps ={ scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        double sum = 0;
        double average = 0;

        for (int i = 0; i <= temps.length-1; i++) {
            sum += temps[i];
            average = sum / temps.length;
        }

        System.out.println(average);

    }
}
