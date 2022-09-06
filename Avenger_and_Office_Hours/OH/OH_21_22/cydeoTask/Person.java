package OH.OH_21_22.cydeoTask;

public class Person {
    /*variables: name, gender, age
                	 methods: eat(), sleep(), drink()*/
    String name, gender;
    int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println( getName() + " eating" );
    }

    public void sleep() {
        System.out.println( name + " sleeping" );
    }

    public void drink() {
        System.out.println( name + " drinking" );

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
