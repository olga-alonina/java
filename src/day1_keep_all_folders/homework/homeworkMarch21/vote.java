package day1_keep_all_folders.homework.homeworkMarch21;

public class vote {
    public static void eligible_to_vote(int age) {
        // create a method that will accept an age and determine if the Person is
        // eligible to vote. Person must be 18 years or older to vote

        int result = 2022 - age;
        if (result >= 18) {
            System.out.println("You are able to vote");
        } else {
            System.out.println("You are out of age");

        }
    }

    public static void main(String[] args) {
        eligible_to_vote(1988);
        eligible_to_vote(2010);
    }
}
