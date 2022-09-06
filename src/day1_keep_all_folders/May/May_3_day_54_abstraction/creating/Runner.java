package day1_keep_all_folders.May.May_3_day_54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {
      //  Create obj = new Create(); cannot make obj of interface
        bookCreating obj = new bookCreating();
        obj.read();
        obj.write();

    }
}
