package day1_keep_all_folders.April.April_26_day_52_inherietance.Final_Example;

public class Main {
    public static void main(String[] args) {
        new Parent().walk();
        new Child().walk();
    }
}

class Parent {
    public final void walk() {
        System.out.println( "You are walking" );

    }
}

class Child extends Parent {
//    @Override  //cannot override final
//    public final void walk() {
//}

}

