package day1_keep_all_folders.February.day6_arithmetic_operators;

public class DifferentType {
    public static void main(String[] args) {
        System.out.println(10-5);
        System.out.println(10*5);
        //double->
        System.out.println(10.0/5);
        //double->double
        System.out.println((int)(10.0/5.0));

        System.out.println((int)10/5.0);// (int)->casting (int) 10.5->10

        System.out.println("**************************");
        byte b1= 10;
        byte b2 = 20;
        byte sumByte = (byte) (b1+b2);
        int sum = b1+b2;
        System.out.println("sum = " + sum);
        System.out.println("sumByte = " + sumByte);




}
}
