package April18;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book( "Ola", "Fantasy", "Olga Alonina" );
       Book book2 = new Book( "The Three Musketeers ", "Adventure", "Alexandre Duma" );
        Book book3 = new Book( "Oliver Twist", "Classics", " Charles Dickens");
        Book book4 = new Book( "DC Comics Watchmen", "Comic ", "Alan Moore" );
        Book book5 = new Book( "Memoirs of a Geisha", "History", "Arthur Golden" );
        Book book6 = new Book( " Royal Holiday", "Otherwise", "Jasmine Guillory");

        ArrayList<Book> allBooks  = new ArrayList<>( Arrays.asList( book1,book2 ,book3,book4,book5,book6));
      System.out.println(allBooks );
        System.out.println("Amount of books is "+Book.bookCount);
       ArrayList<Book> fantasyBooks  = new ArrayList<>( allBooks );
        fantasyBooks.removeIf( each->!each.category.equalsIgnoreCase( "Fantasy" ) );
        System.out.println("fantasy books are " +fantasyBooks);
        System.out.println("book1 ID "+book1.IDgenerator());
    }
}
