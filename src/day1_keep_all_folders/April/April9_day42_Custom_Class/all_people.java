package day1_keep_all_folders.April.April9_day42_Custom_Class;

public class all_people {
    public static void main(String[] args) {
        /*not valid:
       System.out.println(name);
        System.out.println(person.name);*/
        //creating object
        Person personOne = new Person();
        Person personTwo = new Person();
        //accesses the instance variable
        personOne.name  = "James";
        personOne.age = 40;
        personOne.height = 6.59;
        personOne.isMarried=false;
        System.out.println("print#1");
        System.out.println( personOne.name );
        System.out.println( personOne.age );
        System.out.println( personOne.height );
        System.out.println( personOne.isMarried );
        System.out.println("print#2");
        System.out.println( personTwo.name );
        System.out.println( personTwo.age );
        System.out.println( personTwo.height );
        System.out.println( personTwo.isMarried );
    }
}
