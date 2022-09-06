package day1_keep_all_folders.April.April_23_day_51_inheritance.lift;

public class LyftXL extends Lyft {
    public LyftXL(String driver) {
        super( driver );
    }

    @Override
    public double calculateRate(int miles) {
        return super.calculateRate( miles ) * 1.1;
    }
}
