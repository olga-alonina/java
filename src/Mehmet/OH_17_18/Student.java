package Mehmet.OH_17_18;

public class Student {
    String name;
    int age, batchNumber;

    public Student(String name) {
       this.name = name;
       joing_Class( name );
    }

    public Student(String name, int age) {
        this( name );
        this.age = age;
    }
    public  void joing_Class(String name){
        System.out.println(name+" joing class");
    }
    public Student(String name, int age, int batchNumber) {
        this( name, age );
        this.batchNumber = batchNumber;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                '}';
    }


}
