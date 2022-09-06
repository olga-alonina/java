package OH.OH_21_22.cydeoTask;

public class Tester extends Employee {
    /*

      1. Tester
       variables: name, gender, age, jobTitle, employeeID, salary
       methods: work(), attendMeeting()
     */

    public Tester(String name, String gender, int age, String jobTitle, int employeeID, int salary) {
        super( name, gender, age, jobTitle, employeeID, salary );
    }

    public void work() {
        System.out.println( getName() + " is working" );
    }

    public void attendMeeting() {
        System.out.println( getJobTitle() + " " + getName() + " is attending Meetings" );

    }
@Override
    public void drink(String beverage) {
        System.out.println( getJobTitle() + " " + getName() + " is drinking " + beverage );
    }
}