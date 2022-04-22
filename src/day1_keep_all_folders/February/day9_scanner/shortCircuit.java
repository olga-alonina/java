package day1_keep_all_folders.February.day9_scanner;

public class shortCircuit {
    public static void main(String[] args) {
      //  System.out.println(5/0);
        System.out.println(true||5/0==0);
        System.out.println("************************");
        int a = 0;
        System.out.println(false & a++==5);
        System.out.println("a = " + a);
        System.out.println("************************");
        int b = 0;
        System.out.println(false && b++==5);
        System.out.println("b = " + b);
    }
}
