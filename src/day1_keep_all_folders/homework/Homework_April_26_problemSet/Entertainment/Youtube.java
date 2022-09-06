package day1_keep_all_folders.homework.Homework_April_26_problemSet.Entertainment;

import java.util.ArrayList;

public class Youtube extends Streaming {
    String video_name;
    String channel_name;
    int view_count;
    ArrayList<String> comments = new ArrayList<>();

    public Youtube(String name, String company, double
            duration, String video_name, String channel_name, int view_count, ArrayList<String> comments) {
        super( "Streaming", company, duration );
        this.video_name = video_name;
        this.channel_name = channel_name;
        this.view_count = view_count;
        this.comments = comments;
    }
}
