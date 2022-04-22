package day1_keep_all_folders.homework.homeworkFeb8;

public class castingPractice {
    public static void main(String[] args) {
        short apples = 100;
        byte x = (byte) apples;
        System.out.println("x = " + x);

        float price = 16.14f;
        double kingdomPrice = price;
        System.out.println("kingdomPrice = " + kingdomPrice);

        double salary = 3_000_000;
        int q = (int) salary;
        System.out.println("q = " + q);

        long studentsInUniversity = 1_000_000_000;
        int placesInUniversity = (int) studentsInUniversity;
        System.out.println("Places in university = " + placesInUniversity);


    }
}



