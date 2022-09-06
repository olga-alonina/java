package day1_keep_all_folders.May.May28_day63_functional_interface.Homework;

public class UseConsumerFunctional {
    public static void main(String[] args) {
        ConsumerFunctional<Integer, Integer> first_and_lastElementArray = (array) -> {
            System.out.println( array[0] + " " + array[array.length - 1] );
        };
        ConsumerFunctional<String, String> middleCharOfString = (array) -> {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Middle char is " +array[i].charAt( array[i].length() / 2 ) );
            }
        };
        //examples
        String[] arr = {"Ola", "Antena", "Alexa", "Watermelon"};
        first_and_lastElementArray.apply( arr );
        middleCharOfString.apply( arr );
    }
}
