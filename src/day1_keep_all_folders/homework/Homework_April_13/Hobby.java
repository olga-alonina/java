package day1_keep_all_folders.homework.Homework_April_13;

public class Hobby {
    String name;
    double annual_Cost;
    boolean is_Outdoors;
    boolean requires_Others;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annual_Cost) {
        this( name );
        this.annual_Cost = annual_Cost;
    }

    public Hobby(String name, double annual_Cost, boolean is_Outdoors, boolean requires_Others) {
        this( name, annual_Cost );
        this.is_Outdoors = is_Outdoors;
        this.requires_Others = requires_Others;
    }

    public void doIt() {
        if (is_Outdoors) {
            System.out.println( "Do " + name + " outside" );
        } else {
            System.out.println( "Do " + name + " inside" );
        }
    }

    @Override
    public String toString() {
        String obj = name + " usually cost me " + annual_Cost + ",ITS:";
        if (is_Outdoors) {
            obj += " O/";
        } else {
            obj += " I/";
        }
        if (requires_Others) {
            obj += " Comp";
        } else {
            obj += " Alone";
        }
        return obj;
    }

    /*

    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually

Q: What is some difference between Array and ArrayList
Q: How does our custom class objects work with ArrayList
Q: What is an object
Q: How does removeIf method work
Q: How does Arrays.asList method work*/

}

