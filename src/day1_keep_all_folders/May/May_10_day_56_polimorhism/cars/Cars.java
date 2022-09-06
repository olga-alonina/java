package day1_keep_all_folders.May.May_10_day_56_polimorhism.cars;

public class Cars {

}

class BMW extends Cars {
}

class Tesla extends Cars {
}

class Toyota extends Cars {
}

class Ford extends Cars {
}

class LandRover extends Cars {
}

class DealerShip {
    public static void lease(Cars car) {
        System.out.println( "Leasing a car" );
    }

    public static Cars getCars(int option) {
        if (option == 1) {
            return new Tesla();
        } else if (option == 2) {
            return new Toyota();
        } else {
            return new Cars();
        }
    }
}

class Runner {
    public static void main(String[] args) {
        Cars car = new Cars();
        DealerShip.lease( car );
        Tesla tesla = new Tesla();
        DealerShip.lease( tesla );
        DealerShip.lease( new LandRover() );
        DealerShip.lease( new Toyota() );
    }
}