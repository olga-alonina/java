package day1_keep_all_folders.homework.HomeworkMarch3;

public class Replit {
    public static void main(String[] args) {
        int Age = 1;
        int treeHeigh = 0;
        int growth = 0;
        while (Age++ < 10) {
            if (Age++ <= 3) {
                growth = 1;
                treeHeigh += 1;

            } else {
                growth = 2;
                treeHeigh += 2;
            }
        }
        System.out.println("year " + Age + " - growth " + growth + " cm");
        System.out.println("tree size: "+treeHeigh+"cm" );
    }
}
