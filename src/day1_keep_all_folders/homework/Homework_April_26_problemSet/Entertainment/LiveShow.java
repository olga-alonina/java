package day1_keep_all_folders.homework.Homework_April_26_problemSet.Entertainment;

public class LiveShow extends Entertainment{
    String location;

    public LiveShow(String name, String company,String location) {
        super( "Live Show", company );
        this.location = location;

    }
}
