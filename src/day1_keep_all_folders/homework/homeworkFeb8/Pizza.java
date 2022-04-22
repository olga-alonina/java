package day1_keep_all_folders.homework.homeworkFeb8;

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza = "cheese";
        int numberOfSlices = 8;
        int numberOfPeopleEating = 4;
        int slicePerPerson = numberOfSlices/numberOfPeopleEating;
        int leftOver = numberOfSlices%numberOfPeopleEating;
        System.out.println("We ordered "+ typeOfPizza+" pizza with "+ numberOfSlices+ " slices,\n "+
                numberOfPeopleEating+ " people ate "+ slicePerPerson+ " slices each" +
                " other with "+ leftOver+" left over.");
                //
        //Sample print statement:
        //
        //   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
    }
}
