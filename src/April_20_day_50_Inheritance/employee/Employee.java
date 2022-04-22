package April_20_day_50_Inheritance.employee;

public class Employee {
    String name;
    boolean is_Full_Time;
    double salary;

    public void work(String name) {
        this.name = name;
        System.out.println( name + " is working" );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", is_Full_Time=" + is_Full_Time +
                ", salary=" + salary +
                '}';
    }
}
