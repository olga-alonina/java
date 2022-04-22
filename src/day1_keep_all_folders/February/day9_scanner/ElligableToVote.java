package day1_keep_all_folders.February.day9_scanner;

public class ElligableToVote {
    public static void main(String[] args) {
    String name = "Olga Alonina";
    boolean areTheyCitizen = false;
    boolean doHaveCriminalBackground = true;
    int age = 26;
    boolean areYouEligibleToVote  = age>=18 && doHaveCriminalBackground && areTheyCitizen;
        System.out.println("Are you eligible to vote = " + areYouEligibleToVote);

    }
}