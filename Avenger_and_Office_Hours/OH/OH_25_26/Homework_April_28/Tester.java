package OH.OH_25_26.Homework_April_28;

public class Tester extends Employee {

    public Tester(String name, int age, String job_title, double salary) {
        super( name, age, job_title, salary );
    }

    @Override
    public void work() {
        System.out.println("Running test cases ");
    }

    @Override
    public void hobby() {
        System.out.println("Reading books");
    }
}
