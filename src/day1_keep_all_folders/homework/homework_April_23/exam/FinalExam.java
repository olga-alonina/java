package day1_keep_all_folders.homework.homework_April_23.exam;

public class FinalExam extends GradeActivity {

    int numQuestion;// (total question number in the exam)
    double pointsEach;//  (points per each question)
    int numMissed;//   (number of wrong answers)


    public FinalExam(int numQuestion, int numMissed) {
        this.numQuestion = numQuestion;
        this.numMissed = numMissed;
        calcNumericScore();
    }

    public void calcNumericScore() {
        pointsEach = 100 / numQuestion;
        double numericScore = 100 - (numMissed * pointsEach);
        setScore( numericScore );
        System.out.println( numericScore );
    }
}
