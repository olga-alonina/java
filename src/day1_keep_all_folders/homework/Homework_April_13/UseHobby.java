package day1_keep_all_folders.homework.Homework_April_13;

import java.util.ArrayList;
import java.util.Arrays;


public class UseHobby {
    public static void main(String[] args) {
        Hobby[] list = {new Hobby( "reading", 300, false, false ),
                new Hobby( "exercising", 250, false, false ),
                new Hobby( "singing", 400, false, false ),
                new Hobby( "cycling", 550, true, false )};
        ArrayList<Hobby> listHobby = new ArrayList<>( Arrays.asList( list ) );
        for (Hobby each : listHobby) {
            each.doIt();
        }
        System.out.println("***********");
        ArrayList<Hobby> list1Hobby = new ArrayList<>( Arrays.asList( list ) );
        list1Hobby.removeIf( each -> each.is_Outdoors );
        System.out.println( "Indoors=> "+list1Hobby );

        ArrayList<Hobby> list2Hobby = new ArrayList<>( Arrays.asList( list ) );
        list2Hobby.removeIf( each -> each.requires_Others );
        System.out.println("You all alone in the party=> "+list2Hobby );
        ArrayList<Hobby> list3Hobby = new ArrayList<>( Arrays.asList( list ) );
        list3Hobby.removeIf( each -> each.annual_Cost > 500 );
        System.out.println("I'm not so rich=> "+ list3Hobby );
    }
}
