package day1_keep_all_folders.May.May_3_day_54_abstraction.creating;

public class bookCreating implements Create{

    @Override
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}
