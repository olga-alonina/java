package day1_keep_all_folders.homework.Homework_April_26_problemSet.Entertainment;

public class KevinHart extends LiveShow{
    String performer;
    String date;//format Ex: mm/dd/yyyy)

    public KevinHart(String name, String company, String location, String performer, String date) {
        super( "Live Show", company, location );
        this.performer = performer;
        this.date = date;
    }
}
