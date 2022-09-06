package day1_keep_all_folders.April.April_20_day_50_Inheritance.book;

public class Library {
    public static void main(String[] args) {
        Book obj = new Book();
        AudioBook obj1 = new AudioBook();
        obj1.duration = 100;
        obj1.narrator="Alonina Olga";
        obj1.title = "Java is fun";
        obj1.listen();

        EBook obj2 = new EBook();
        obj2.size=20.4;
        obj2.pages = 1004;
        obj2.title = "Soft skills is important";
        obj2.read();

        Book obj3= new Book();
        obj3.author = new Author( "JK Rowling", 40 );
        System.out.println(obj3.author);
        System.out.println(obj3.author.getName());




    }
}
