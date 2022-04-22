package day1_keep_all_folders.homework.homeworkFeb8;

public class batch26practice {
    public static void main(String[] args) {
        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        int salary = 200_000;
        int startDay = 10;
        int startMonth = 1;
        int startYear = 2022;
        boolean fullTime = true;
        String jobTitle = "SDET";
        String officeAddress = "One Apple Park Way, Cupertino, CA 95014";
        String fullName = firstName + "\t" + lastName;
        System.out.println("full Name = " + fullName);
        String startDate = startMonth + "/" + startDay + "/" + startYear;
        System.out.println("start Date = " + startDate);
//email: (first name + start day @ company name .com)
        String email = firstName + startDay + "@" + companyName + ".com";
        System.out.println("email = " + email);
        //salary after 2 years (base salary * 15 %)
        int salaryAter2Years = salary+ salary * 15/100;
        System.out.println("Employee Information");
        System.out.println("We have " + fullName + " joining " + companyName);
        System.out.println(firstName + " will start on " + startDate + " as full time: " + fullTime);
        System.out.println(firstName + " here is some information about your employment\n" + "Your email is " + email +
                "\n" + "Your base salary is $" + salary + " and after 2 years it will be $ " + salaryAter2Years + "\n" +
                "Welcome aboard, see you at " + officeAddress);
    }
}
