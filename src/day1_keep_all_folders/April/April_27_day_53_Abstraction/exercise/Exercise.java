package day1_keep_all_folders.April.April_27_day_53_Abstraction.exercise;

public abstract class Exercise {
    final String name;

    public Exercise(String name) {
        this.name = name;
    }

    public abstract void ex1();
    public abstract int getCaloriesBurned(int minutes);
}
