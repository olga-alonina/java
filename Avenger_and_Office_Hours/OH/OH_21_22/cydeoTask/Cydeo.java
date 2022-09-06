package OH.OH_21_22.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Student student = new Student( "Mike","male", 26,6,"Enger" );
        student.attendClass();
        student.study();
        System.out.println( student );
    }
}
