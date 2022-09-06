package AH.May9.Animal;

public class Park {
    public static void main(String[] args) {
        Dog dog = new Dog( "Fluffy", 2, "Pomeranian" );
        System.out.println( dog );
        Dog dog1 = dog;
        System.out.println( dog.equals( dog1 ) );//true
        dog1 = new Dog( "Nord", 3, "German Shepherd" );
        System.out.println( dog.equals( dog1 ) );//false
    }
}
