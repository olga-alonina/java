package day1_keep_all_folders.homework.homework_April_17;

public class Rectangle {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        setLength( length );
        setWidth( width );

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.err.println( "please chose positive number" );
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.err.println( "please chose positive number" );
        }
    }

    public double calculateArea(double length, double width) {
        return length * width;

    }

    public double calculatePerimeter(double length, double width) {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return   "length=" + length +
                "\nwidth=" + width;
    }
}



    /*  create a class called Rectangle

        -
        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Rectangle

            - calculatePerimeter()
  				calculate and return the perimeter of a Rectangle

            - toString()
                print the length, width, area, and perimeter of the Rectangle object

    Create a separate class to create and test the Rectangle objects
*/

