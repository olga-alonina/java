package day1_keep_all_folders.May.May_7_day_55_polimorfizm.interface_methods;

public class MacbookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println( "Mac is turning on" );
    }
}

class useMacbookPro {
    public static void main(String[] args) {
        System.out.println( Mac.NAME );
        System.out.println( Mac.OS );
        //you can access the static variables from the child class reference,
        // but you should use the interface to access
//      System.out.println( MacbookPro.NAME );
//      System.out.println( MacbookPro.OS );
        Mac.company();
//        Mac.faceTime(); //the default method  needs to be cold by the obj


        // Mac.turnOn();//need a obj to call this method
        MacbookPro obj = new MacbookPro();
        obj.turnOn();
        obj.faceTime();
    }
}