package day1_keep_all_folders.May.May_3_day_54_abstraction.Animal;

import day1_keep_all_folders.May.May_3_day_54_abstraction.creating.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println( "Parrot wobble over to the seeds" );
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("Hello, hello");

    }

    @Override
    public void bye() {
        System.out.println("Bye, bye");

    }
}
