package day1_keep_all_folders.February.day05_lessons;

public class TypeCasting {
    public static void main(String[] args) {

    byte b = 40;
    int i =b;

    int i2 = 100;
    byte b2 =(byte) i2;//if 1large that 2 add 2tupe in front

    int i3 = 500;
    long l1 = i3;

    long l2 = 200;
    int i4 = (int)l2;

    double d = 50;
    int i5 = (int)d;
    System.out.println("i5 = " + i5);
    System.out.println("d = " + d);
 }
}
