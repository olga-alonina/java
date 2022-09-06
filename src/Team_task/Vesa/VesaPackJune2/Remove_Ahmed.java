package Team_task.Vesa.VesaPackJune2;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Ahmed {
        /*1) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed*/
    public static ArrayList<String> removeName(ArrayList<String>list, String name){
        list.removeIf( each->each.equals( name ) );
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>( Arrays.asList("Ahmed","John", "Eric","Ahmed"));
        System.out.println(removeName( list,"Ahmed" ));
    }
}
