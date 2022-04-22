package day1_keep_all_folders.April.April9_day42_Custom_Class;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {
       App cydeo= new App();
       cydeo.name = "Cydeo";
       cydeo.version=5.5;
       cydeo.isFree = true;
       /*not valid
       App.run;
       App.update;*/
       cydeo.run();
       cydeo.update();
        System.out.println( cydeo.name );
        System.out.println( cydeo.version );
        System.out.println( cydeo.isFree );
       // System.out.println( cydeo );//print some numbers

        new App().run();

        new Scanner( System.in ).nextLine();
    }
}
