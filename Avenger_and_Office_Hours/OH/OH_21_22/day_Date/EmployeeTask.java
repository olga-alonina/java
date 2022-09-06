package OH.OH_21_22.day_Date;

public class EmployeeTask {
    private String name, gender;
    private int age, salary;

    public EmployeeTask(String name, String gender, int age, int salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println( "Name can not be empty" );
        }
    }

    public String getGender() {
        if (gender.equalsIgnoreCase( "M" )) {
            return "Male";
        } else if (gender.equalsIgnoreCase( "F" )) {
            return "Female";
        } else {
            return "Undefined";
        }
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase( "M" ) || gender.equalsIgnoreCase( "F" )) {
            this.gender = gender;
        } else {
            System.err.println( "Gender can not anything other than female or male" );
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.err.println( "Age can not be less than 18" );
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.err.println( "Salary can not be zero or negative" );
        }
    }

    @Override
    public String toString() {
        return "EmployeeTask{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
