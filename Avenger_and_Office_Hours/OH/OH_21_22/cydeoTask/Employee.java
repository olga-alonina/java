package OH.OH_21_22.cydeoTask;

public abstract class Employee extends Person {
    //  variables: name, gender, age, jobTitle, employeeID, salary
    String name, gender, jobTitle;
    int age, employeeID, salary;

    public Employee(String name, String gender, int age, String jobTitle, int employeeID, int salary) {
        super( name, gender, age );
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //  methods: work(), attendMeeting()
    public void work() {
        System.out.println( name + "working" );
    }

    public void attendMeeting() {
        System.out.println( name + "attending meeting" );
    }

    @Override
    public String toString() {
        return "Employee{jobTitle=" + jobTitle +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                super.toString();

    }

    public abstract void drink(String beverage);
}
