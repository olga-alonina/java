package day1_keep_all_folders.February.day9_scanner;

public class Discount {
    public static void main(String[] args) {
        // get a discount if its a friday and you are a teacher or police office, or firefighter
        boolean itIsFriday = true;
        boolean areYouTeacher = false;
        boolean areYouPolicemen = false;
        boolean areYouFirefighter = false;
        boolean hasDiscont = itIsFriday && areYouTeacher || areYouPolicemen || areYouFirefighter;
        System.out.println("Do you eligble for discount? " +hasDiscont);

                   }
}
