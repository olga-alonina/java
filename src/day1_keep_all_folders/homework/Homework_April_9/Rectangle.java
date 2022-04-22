package day1_keep_all_folders.homework.Homework_April_9;

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;

    @Override
    public String toString() {
        return "***Rectangle***\nbase\t\t" + base +
                ",\nheight\t\t" + height +
                ",\nperimeter\t" + perimeter +
                ",\narea\t\t" + area;

    }public void calculatePerimeter(){
        perimeter=(base+height)*2;
        System.out.println( "perimeter\t " + perimeter );
    }
   public void calculateArea(){
        area=base*height;
       System.out.println( "area\t\t " + area );

   }
}

