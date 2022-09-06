package OH.OH_25_26.Homework_April_28;

public abstract class Employee extends Person {
    String job_title;
    double salary;

    public Employee(String name, int age, String job_title, double salary) {
        super( name, age );
        this.job_title = job_title;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "job_title='" + job_title + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
