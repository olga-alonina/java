package day1_keep_all_folders.April.April_27_day_53_Abstraction.exercise;

public class Running extends Exercise{
    public Running() {
        super( "Running" );
    }

    @Override
    public void ex1() {
        System.out.println("Running for fun, not sure who does this");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes*5;
    }
}
