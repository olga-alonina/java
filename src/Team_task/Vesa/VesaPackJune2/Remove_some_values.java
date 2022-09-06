package Team_task.Vesa.VesaPackJune2;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_some_values {
    /*Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100*/
    public static ArrayList<Integer> remove_some_values(ArrayList<Integer> list){
        list.removeIf( each->each>100 );
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>( Arrays.asList(145,15,22,33,44,88,456,125));
        System.out.println(remove_some_values( list ));
    }
}
