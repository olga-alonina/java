package day1_keep_all_folders.February.day04_variables;

public class school {

    public static void main(String[] args) {
        int grade;
        int student1 = 25;
        int student2 = 30;
        int student3 = 16;
        int student4 = 34;
        int student5 = 38;
        float gpa = 3.5F;
        int summary = student1+student2+student3+student4+student5;
        System.out.println("Number of students in grade 1 is "+ student1);

        System.out.println("Number of students in grade 2 is "+student2);

        System.out.println("Number of students in grade 3 is "+ student3);

        System.out.println("Number of students in grade 4 is "+ student4);

        System.out.println("Number of students in grade 5 is "+ student5);
        System.out.println("Total number of students in your school "+ summary);
        double daysInYear = 101.5;
        double SnowDays = 5.6;
        double averegeGpaInSchool = 3.8;
        System.out.println("Number days in the year "+ daysInYear);
        System.out.println("Number of snow days in the year " + SnowDays);
        System.out.println("Avarage GPA in school "+ averegeGpaInSchool);
    }
}
