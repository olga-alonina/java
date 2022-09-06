package day1_keep_all_folders.April.April_23_day_51_inheritance.lift;

public class CarRide {
    public static void main(String[] args) {
        Lyft obj = new Lyft( "James" );
        System.out.println(obj.calculateRate( 10 ));
        System.out.println("**************LyftXL*********");
        LyftXL obj2 = new LyftXL( "James" );
        System.out.println(obj2.calculateRate( 10 ));
    }
}
