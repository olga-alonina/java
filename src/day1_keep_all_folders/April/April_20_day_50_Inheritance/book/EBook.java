package day1_keep_all_folders.April.April_20_day_50_Inheritance.book;

public class EBook extends Book {
    double size;
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of " + title);
    }

}
/*
Create a class EBook

    - EBook class inherits Book class

    - create additional variables:
        size, pages

    - create method:
        read()
            Example output: prints Reading a digital copy of $title
 */


