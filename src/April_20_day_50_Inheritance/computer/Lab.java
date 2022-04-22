package April_20_day_50_Inheritance.computer;

public class Lab {
    public static void main(String[] args) {
        Computer obj = new Computer( "Generic",300 );
        System.out.println(obj);

        Windows obj1 = new Windows( 300 );
        System.out.println(obj1);

        Mac obj2 = new Mac(300 );
        System.out.println( obj2 );

    }
}
