package day1_keep_all_folders.March.day25and26Recap;

public class calandar {
    public static void main(String[] args) {
        for (int week = 1; week <= 4; week++) {
            System.out.println("*******Week " + week + "********");
            if (week <= 1) {
                for (int day = 1; day <= 7; day++) {
                    System.out.print(" "+day + " ");
                }
                System.out.println();
            } else if (week <= 2) {
                for (int day1 = 8; day1 <= 14; day1++) {
                    System.out.print(" "+day1);
                } System.out.println();
            } else if (week <= 3) {
                for (int day2 = 15; day2 <= 21; day2++) {
                    System.out.print(day2 + " ");
                } System.out.println();
            } else {
                for (int day3 = 22; day3 <= 28; day3++) {
                    System.out.print(day3 + " ");
                } System.out.println();
            }
        }
    }
}
