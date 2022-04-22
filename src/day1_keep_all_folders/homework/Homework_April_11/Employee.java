package day1_keep_all_folders.homework.Homework_April_11;


public class Employee {
    public String name;
    public String job_title;
    public int id;
    public double salary;

    public Employee(String name, String job_title, int id, double salary) {
        this.name = name;
        this.job_title = job_title;
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
        goToMeeting();
    }

    public Employee(String name, String job_title) {
        this( name );
        this.job_title = job_title;

    }

    public Employee(String name, int id, String job_title, double salary) {
        this( name, job_title );
        this.id = id;
        this.salary = salary;
    }

    public String goToMeeting() {
        return name + " is going to a meeting";
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
