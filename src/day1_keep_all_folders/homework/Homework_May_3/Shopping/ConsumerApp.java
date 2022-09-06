package day1_keep_all_folders.homework.Homework_May_3.Shopping;

// we are passing the methods from the Shipping and AllowUserToSell interface to the ConsumerApp interface

// going from interface to interface is inheritance, so we use extends. Remember these are interface, so they don'title follow the same rules as classes. We can extend multiple interfaces

public interface ConsumerApp extends Shipping, AllowUsersToSell {

}

// the first example is if we implemented both of the original interface to a class directly
abstract class TestA implements Shipping, AllowUsersToSell {
}

// in this example we use the ConsumerApp interface that had Shipping and AllowUserToSell interfaces inherited
abstract class TestB implements ConsumerApp {
}