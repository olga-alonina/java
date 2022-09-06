package day1_keep_all_folders.April.April_23_day_51_inheritance.shapes;

public class AllShapes {
    public static void main(String[] args) {
        Square obj = new Square( 1.5 );
        System.out.println( obj );
        System.out.println( obj.area() );
        System.out.println( obj.perimeter() );
        System.out.println("******Circle**********");
        Circle obj1 = new Circle( 3 );
        System.out.println( obj1 );
        System.out.println( obj1.area() );
        System.out.println( obj1.perimeter() );
    }
}
