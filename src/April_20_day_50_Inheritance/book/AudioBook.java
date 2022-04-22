package April_20_day_50_Inheritance.book;

public class AudioBook extends Book {
    String narrator;
    double duration;
   public void listen(){
       System.out.println("Listening to " + title + " " +
               "narrated by " + narrator);
   }}
    /*Create a class AudioBook

    - AudioBook class inherits Book class

    - create additional variables:
        duration, narrator

    - create method:
        listen()
            Example output: prints listening to $title
             narrated by $narrator*/


