package day1_keep_all_folders.April.April_26_day_52_inherietance.hiding;

public class B extends A{
    @Override
    public  void instanceMethodA() {
        staticMethod();
    }public static void staticMethod() {
        System.out.println("static Method from child class");
    }
}
