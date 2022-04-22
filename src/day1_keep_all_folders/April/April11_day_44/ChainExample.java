package day1_keep_all_folders.April.April11_day_44;

public class ChainExample {
    public ChainExample() {
        System.out.println( "1" );
    }

    public ChainExample(int i) {
        this();
        System.out.println( "2" );
    }

    public ChainExample(String s) {
        this();
        System.out.println( "3" );
    }public ChainExample(double d){
        this(0);
        System.out.println("4");
    }
}
