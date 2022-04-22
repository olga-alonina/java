package day1_keep_all_folders.homework.Homework_April_12;


public class Offer {
    public String location, company;
    public double salary, numOfPTO;
    public boolean isFullTime;

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, double numOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }

    public String toString() {
        String obj = company;
        if (location != null) {
            obj += " | " + location;
        }
        if (salary != 0) {
            obj += " | " + salary;
        }
        if (numOfPTO != 0) {
            obj += " | " + numOfPTO;
        }
        if (isFullTime) {
            obj += " | full time";
        }
        return obj;
    }
}

