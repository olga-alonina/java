package day1_keep_all_folders.homework.homeworkFeb10;

public class KgTopounds {
    public static void main(String[] args) {
        int kg = 10;
        double lbInkg = 2.20_462;
        double lb = kg * lbInkg;
        System.out.println(kg + " kg is equal to " + lb + " pounds");
        kg = kg + 10;
        double lb2 = kg * lbInkg;
        System.out.println(kg + " kg is equal to " + lb2 + " pounds");
    }
}
