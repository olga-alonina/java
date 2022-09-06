package OH.OH_25_26.Homework_April_28;

public class Chef extends Employee{
    public Chef(String name, int age, String job_title, double salary) {
        super( name, age, job_title, salary );
    }

    @Override
    public void work() {
        System.out.println( " Cooking a 3 course meal" );

    }

    @Override
    public void hobby() {
        System.out.println( " Trying new food" );

    }
}
