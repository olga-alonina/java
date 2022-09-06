package day1_keep_all_folders.homework.Homework_April_26_problemSet.Entertainment;

public class Netflix extends Streaming {
    String show_name;
    int episode_number;
    int season_number;

    public Netflix(String name, String company, double duration,
                   String show_name, int episode_number, int season_number) {
        super( "Streaming", company, duration );
        this.show_name = show_name;
        this.episode_number = episode_number;
        this.season_number = season_number;
    }
}

