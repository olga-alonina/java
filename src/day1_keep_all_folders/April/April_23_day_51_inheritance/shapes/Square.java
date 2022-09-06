package day1_keep_all_folders.April.April_23_day_51_inheritance.shapes;

public class Square extends Shape {
    double side;

    public Square(double side) {
        super( "Square" );
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;

    }

    @Override
    public double perimeter() {
        return side * 4;
    }
}