package day1_keep_all_folders.homework.homework_April_17;


public class UseSquare {
    public static void main(String[] args) {
        Square newObj = new Square( 5 );
        System.out.println( "Area() = " + newObj.calculateArea() );
        System.out.println( "Perimeter() = " + newObj.calculatePerimeter() );
        System.out.println( newObj );
        System.out.println( "******Set***********" );
        System.out.println( newObj.getSide() );
        newObj.setSide( 10 );

        System.out.println( "Area() = " + newObj.calculateArea() );
        System.out.println( "Perimeter() = " + newObj.calculatePerimeter() );
        System.out.println( newObj );
    }
}
