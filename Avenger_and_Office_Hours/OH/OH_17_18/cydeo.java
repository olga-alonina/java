package OH.OH_17_18;

import java.util.ArrayList;
import java.util.Arrays;

public class cydeo {
    public static void main(String[] args) {
        Student[] allSt = {new Student( "Emre" ),
                new Student( "Olga", 35, 26 ),
                new Student( "OH", 25, 20 ),
                new Student( "Alex", 18, 25 ),
                new Student( "Leo", 42, 21 ),
                new Student( "Max", 54, 18 ),
                new Student( "Lucas", 32, 26 )};

        ArrayList<Student> allStudents = new ArrayList<>( Arrays.asList( allSt ) );
        allStudents.removeIf( each -> each.batchNumber != 26 );
        System.out.println( allStudents );
    }
}

