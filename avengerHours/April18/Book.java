package April18;

public class Book {
    String name, category, author, bookID;
    int shelfNum;

    static int bookCount;

    static {
        bookCount = 0;
    }

    public Book(String name, String category, String author, String bookID, int shelfNum) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.bookID = bookID;
        this.shelfNum = shelfNum;

    }

    public Book(String name) {
        this.name = name;
        bookCount++;
    }

    public Book(String name, String category) {
        this( name );
        this.category = category;
        setShelfNum();


    }

    public Book(String name, String category, String author) {
        this( name, category );
        this.author = author;
        IDgenerator();
    }

    @Override
    public String toString() {
        return author + "'s book \"" + name + "\" " +
                "is on " + shelfNum + " shelf. Category "
                + category + ", its id is " + bookID + "\n";
    }

    public void setShelfNum() {
        if (category.equalsIgnoreCase( "Adventure" )) {
            shelfNum = 1;
        }
        if (category.equalsIgnoreCase( "Classics" )) {
            shelfNum = 2;
        }
        if (category.equalsIgnoreCase( "Comics" )) {
            shelfNum = 3;
        }
        if (category.equalsIgnoreCase( "Fantasy" )) {
            shelfNum = 4;
        }
        if (category.equalsIgnoreCase( "History" )) {
            shelfNum = 5;
        }
        if (category.equalsIgnoreCase( "Otherwise" )) {
            shelfNum = 0;
        }
    }

    public String IDgenerator() {
        bookID = shelfNum + "_" + author.toUpperCase().charAt( 0 ) + "_"
                + name.toUpperCase().substring( 0, 2 );
        return bookID;
    }
}
