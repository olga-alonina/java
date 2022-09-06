package day1_keep_all_folders.May.May15_day58_exceptions.Homework;

public class Pen {
    double inkLevel;
    String inkColor;

    public void write() {//todo check line 22 and 10
        if (inkLevel <= 10) {
            Exception OutOfInkException;
            // throw new OutOfInkException(str);
        } else {
            System.out.println( "Writing with pen, 10 ink used" );
            inkLevel -= 10;
        }
    }

    void changeColor(String color) {
        if (color.equalsIgnoreCase( "black" )
                || color.equalsIgnoreCase( "red" ) || color.equalsIgnoreCase( "blue" )) {
            this.inkColor = inkColor;
        } else {
          //  throw new InvalidColorException( str );
        }
    }
}
