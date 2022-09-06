package day1_keep_all_folders.homework.Homework_April_26_problemSet.quiz;

import java.util.ArrayList;

public class Module {
    ArrayList<File> list = new ArrayList<>();

    public Module() {
    }

    public Module(ArrayList<File> news) {
        this();
        this.list = news;
    }

    public String toString(Quiz quiz) {
        return quiz.toString();
    }

    public void addFile(File info) {
        list.add( info );
    }public void removeFile(File info){
        list.remove( info );
    }
}

