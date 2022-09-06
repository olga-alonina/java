package day1_keep_all_folders.homework.homework_April_23.exam;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        System.out.println( "How many questions in the Exam?" );
        int question = scan.nextInt();
        System.out.println( "How many questions is missed?" );
        int missed = scan.nextInt();
        FinalExam s = new FinalExam( question, missed );
        System.out.println( s.getScore() );
        s.getGrade();
    }
}
