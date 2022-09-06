package day1_keep_all_folders.May.May_7_day_55_polimorfizm.interface_methods;

public interface Mac {
    String NAME = "Mac";//public static final variables
    String OS = "IOS";

    void turnOn();//public abstract

    //how to create a method with implementation in interface
    //1=>static method
    static void company() {
        System.out.println( "Apple" );
        System.out.println( "HQ in LA" );
        System.out.println( "New release in NOV" );
    }

    //2=>default method
    public default void faceTime() {//default method is for interface. its not access modifier
        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }

}

