package day1_keep_all_folders.April.April11_day_44;

public class newEmployee {
    String name, job_title;
    double id, salary;

    public newEmployee(String name, String job_title) {
        this.name = name;
        this.job_title = job_title;
    }

    public newEmployee(String name, double id, String job_title, double salary) {
        this(name, job_title );
        this.id = id;
        this.salary = salary;
    }

    public void goToMeeting() {
        System.out.println( name + " is going to a meeting" );
    }

    @Override
    public String toString() {

        String a = name;
        if (id != 0) {
            a += " | " + id;
        }
        if (job_title != null) {
            a += " | " + job_title;
        }
        if (salary != 0) {
            a += " | " + salary;
        }
        return a;
    }
}

