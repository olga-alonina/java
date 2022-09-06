package day1_keep_all_folders.homework.Homework_May_7.Book;


public class Library {
    public static void main(String[] args) {
        System.out.println( "********JavaTextbook******" );
        JavaTextbook book = new JavaTextbook();
        //variables
        book.size = 100;
        book.name = "xoxoxo";
        book.fun = true;
        //methods
        book.download();
        book.read();
        book.open();
        System.out.println( "****EBook*****" );
        EBook book1 = new JavaTextbook();
        //variables
        book1.size = 200;
        book1.name = "tututut";
        // book1.fun = false;
        //methods
        book1.open();
        book1.download();
        book1.read();
        System.out.println( "****Downloadable*****" );
        //methods
        Downloadable book2 = new JavaTextbook();
        //variables
//        book2.size=300;
//        book2.name = "lalala";
//        book2.fun= true;

//        book2.open();
        book2.download();
//        book2.read();

        System.out.println( "****Book*****" );
        Book book3 = new JavaTextbook();
        //variables
        //   book3.size=100;
        book3.name = "tprytpry";
        // book3.fun= true;
        //methods
//        book3.open();
//        book3.download();
        book3.read();
        JavaTextbook book5 = (JavaTextbook) book2;
        // book2 was the interface reference, we cast the reference to
        // be a JavaTextbook and assigned it to the book5 reference
        book5.read();
        book5.open();
        book5.fun = false;
    }
}

