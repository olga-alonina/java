package AH.May9.Animal;

public class Dog extends Animal {
    String breed;
    int humanYears;


    public Dog(String name, int age, String breed) {
        super( name, age );
        this.breed = breed;
    }

    @Override
    int getAgeInHumanYears() {
        if (age <= 2) {
            humanYears = age * 11;
        } else {
            humanYears = 22 + ((age - 2) * 5);

        }
        return 0;
    }

    public boolean equals(Dog dog) {
        if (this.age == dog.age && this.breed.equals( dog.breed ) && this.name.equals( dog.name )) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " Breed: " + breed + " Age in calendar years: "
                + age + " Age in human years: " + humanYears;
    }
}

