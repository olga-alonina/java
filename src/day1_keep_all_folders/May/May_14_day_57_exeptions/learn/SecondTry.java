package day1_keep_all_folders.May.May_14_day_57_exeptions.learn;

public class SecondTry {
    public static void main(String[] args) {

        try{

            String s = null;
//            String s = "java";
            System.out.println(s.length()); // null.length()

            int [] a = {1, 4, 5, 2};
            System.out.println(a[10]);

        } catch (NullPointerException e){
            System.out.println("Caught a null pointer exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the Array index out of Bounds");
        }

        System.out.println("Done");


    }
}
