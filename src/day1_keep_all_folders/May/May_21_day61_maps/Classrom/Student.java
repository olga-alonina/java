package day1_keep_all_folders.May.May_21_day61_maps.Classrom;

public class Student {
    String name;
    double gpa;
    int id;


    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", id=" + id +
                '}';
    }
}
