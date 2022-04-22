package day1_keep_all_folders.homework.homeworkMarch21;

public class Triangle_or_circle {
    public static void figure(int num1, int num2, int num3) {
        //Create a method that will that accepts three numbers. Check if the three numbers equal to 180.
        //		If they are equal to 180 print: "This is a triangle"
        //		If they are equal to 360 print: "This is a circle"
        if (num1 + num2 + num3 == 180) {
            System.out.println("This is a triangle");
        } else if (num1 + num2 + num3 == 360) {
            System.out.println("This is a circle");
        } else {
            System.out.println("this is another figure");
        }
    }

    public static void main(String[] args) {
        figure(30, 60, 90);
        figure(99, 99, 99);
        figure(180, 90, 90);
    }
}