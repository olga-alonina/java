package day1_keep_all_folders.April.April11_day_44;

public class newOffer {
    String location, company;
    double salary, numOfPTO;
    boolean isFullTime;

    public newOffer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public newOffer(String company, String location, double salary) {
        this( company, location );
        this.salary = salary;
    }

    public newOffer(String company, String location, double salary, boolean isFullTime, double numOfPTO) {
        this( company, location, salary );
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


