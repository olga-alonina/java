package day1_keep_all_folders.homework.homework_April_17;

public class UseRectangle {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle( 6, 8 );
        obj.setLength( 2 );
        obj.setWidth( 6 );
        System.out.println( "Area()= " + obj.calculateArea( 2, 6 ) );
        System.out.println( "Perimeter() = " + obj.calculatePerimeter( 8, 9 ) );


    }
}
