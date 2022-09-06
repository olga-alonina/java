package OH.OH_27_28.StudentTask;

public abstract class Student extends Person {
    private String batchNumber;

    public Student(String name, int age, String batchNumber) {
        super( name, age );
        this.batchNumber = batchNumber;
    }

    public void code(String language) {
        System.out.println( "Student is using coding language " + language );
    }

    public String getBatchNumber() {
        return batchNumber;
    }


    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "batchNumber='" + batchNumber + '\'' +
                '}';
    }
}
