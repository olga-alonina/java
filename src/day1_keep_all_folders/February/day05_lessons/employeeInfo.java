package day1_keep_all_folders.February.day05_lessons;

public class employeeInfo {
    public static void main(String[] args) {
        String firstName = "Olga";
        String lastName = "Alonina";
        String gender = "women";
        int age = 33;
        String companyName = "Here";
        boolean areThefulltime = true;
        String jobTitle = "SDET";
        long salary = 150_000L;
        int numberOfPTO = 15;
        boolean areTheyMarried = true;
        char suite = '6';
        System.out.println("My name is "+firstName+" "+lastName+" and it is " + areTheyMarried+ " that I am married,\n" +
                " my age is "+  age +" and I am "+ gender+". I curreantly dream about working in company " + companyName + " located in " + suite + "" +
                " \nsuite of this bilding.Is it " + areThefulltime + " that i wanna work full time,in possision\n"
                + jobTitle + " with " + salary + " $ salary.");


    }
}
