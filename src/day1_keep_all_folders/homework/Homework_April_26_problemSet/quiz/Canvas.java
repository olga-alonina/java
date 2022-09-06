package day1_keep_all_folders.homework.Homework_April_26_problemSet.quiz;

import java.util.ArrayList;

public class Canvas {
    String topic;
    ArrayList<Quiz> quizzes = new ArrayList<>();
    ArrayList<Module> modules = new ArrayList<>();

    public Canvas(String topic) {
        this.topic = topic;
        this.quizzes = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this(topic);
        this.quizzes = quizzes;
        this.modules = modules;
    }
}