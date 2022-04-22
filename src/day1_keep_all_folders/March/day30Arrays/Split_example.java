package day1_keep_all_folders.March.day30Arrays;

public class Split_example {
    public static void main(String[] args) {
        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String[] days = s.split(",");
        //System.out.println(Arrays.toString(days));
        for (String day : days) {
            System.out.println(day);
        }
        System.out.println("*************");
        String[] withoutDay = s.split("day");
        for (String every : withoutDay) {
            System.out.println(every);
            System.out.println("**********");
            String months = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
            String[] str = months.split("-");
            for (String each:str){
                System.out.println(each);

            }
        }

    }
}


