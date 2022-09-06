package Team_task.Vesa.VesaPackJune2;

import java.util.*;

public class Sort_Ascending_and_Descending_Arraylist {//removed duplicates

    public static void ascending_Way(ArrayList<Integer> list) {
        Set<Integer> set = new TreeSet<>( list );
        System.out.println( "result= " + set );
    }

    public static void descending_Way(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        do {
            Integer number = Collections.max( list );
            temp.add( number );
            list.removeIf( each -> each.equals( number ) );
        }
        while (list.size() > 0);
        System.out.println( "result = " + temp );


    }

    //   int middleList = (list.size()/2)+1;
    public static void descending_Way2(ArrayList<Integer> list) {
        int i = 0;
        int count = 0;
        do {
            if (list.get( i ) > list.get( i + 1 )) {
                Collections.swap( list, i, i + 1 );
            }
            i++;
            if (i == list.size() - 1) {
                i = 0;
                count++;
            }
        } while (count != list.size()-1);
        System.out.println( "list = " + list );
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList( 12, 45, 2, 8, 99, 65, 124, 99, 12 ) );
//        ascending_Way( list );
//        descending_Way( list );
        descending_Way2( list );

    }
}

