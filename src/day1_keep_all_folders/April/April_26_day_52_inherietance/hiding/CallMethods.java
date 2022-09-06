package day1_keep_all_folders.April.April_26_day_52_inherietance.hiding;

public class CallMethods {
    public static void main(String[] args) {
        A obj = new A();
        obj.instanceMethodA();
        A.staticMethod();
        System.out.println("*****new obj****");
        B obj2 = new B();
        obj.instanceMethodA();
        B.staticMethod();
    }
}
