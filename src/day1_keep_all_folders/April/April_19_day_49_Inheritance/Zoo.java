package day1_keep_all_folders.April.April_19_day_49_Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal one = new Animal();
        one.species = "Generic Animal";
        one.legs = 0;
        one.walk();

        Dog dog1 = new Dog();
        dog1.species = "Generic Animal";
        dog1.legs = 0;
        dog1.walk();

       Lion lion = new Lion();
       lion.roar();
       lion.species = "lion";
       lion.walk();
     //  lion.bark; dont have access
    }

}
