package day1_keep_all_folders.homework.Homework_April_26_problemSet.quiz;

import java.util.ArrayList;

public class Using_Canvas {
    public static void main(String[] args) {
        Canvas awesome = new Canvas( "Introduction" );
        Module in = new Module();
        File ins = new File( "Soft skill", 80 );
        Quiz inside = new Quiz( " instance variables ", 10, 10 );

        in.addFile( ins );

        System.out.println( in.list );
        ins.openFile();
        System.out.println( "-------------quiz----------------------" );
        System.out.println( inside );
        inside.takeQuiz();
        System.out.println( "-----------------quiz1------------------" );
        ArrayList<Quiz> quiz1 = new ArrayList<>();
        quiz1.add( inside );

        System.out.println( in.list );
    }
}

