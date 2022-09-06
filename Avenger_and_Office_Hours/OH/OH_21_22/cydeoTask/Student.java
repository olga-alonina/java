package OH.OH_21_22.cydeoTask;

public class Student extends Person {
    // variables: name, gender, age, schoolName, studentId
    private int studentId;
    private String schoolName;

    public Student(String name, String gender, int age, int studentId, String schoolName) {
        super( name, gender, age );
        this.studentId = studentId;
        this.schoolName = schoolName;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //methods: study(), attendClass()
    public void study() {
        System.out.println( getName() + " studying" );
    }

    public void attendClass() {
        System.out.println( getName() + " attending class" );
    }

    @Override
    public String toString() {
        return "Student{ studentId=" + studentId +
                ", schoolName='" + schoolName + " " +
                super.toString();
    }
}
