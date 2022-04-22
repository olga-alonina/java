package day1_keep_all_folders.April.April2_day40;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String> titles = new ArrayList<>();
        titles.addAll( Arrays.asList( "Sdet", "Developer", "Po", "CEO", "Devops", "Qa","Po","Ba", "Chef", "Doctor" +
                "", "Police officer" ) );
        System.out.println( "titles = " + titles );
        System.out.println("*********************");
        ArrayList<String> job1 = new ArrayList<>( titles );
        job1.removeAll( Arrays.asList( "Po", "Qa", "Ba" ) );
        System.out.println( "job1 = " + job1 );
        System.out.println("*********************");
        ArrayList<String> job2 = new ArrayList<>( titles );
        job2.retainAll( Arrays.asList("Sdet", "Developer", "Devops", "Po"));
        System.out.println( "job2 = " + job2 );
        System.out.println("*********************");
        ArrayList<String> job3 = new ArrayList<>( titles );
        System.out.println(job3.containsAll(  Arrays.asList("Chef", "CEO" )));
        System.out.println(job3.containsAll(  Arrays.asList("Doctor", "Nurse" )));
    }
}
