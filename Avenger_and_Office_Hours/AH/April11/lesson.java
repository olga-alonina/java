package AH.April11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lesson {
    public static void main(String[] args) {
        // declaring array
        int[] arr;//accepting obj and primitives;

        //declaring arrayList
        ArrayList<Integer> list1;

        //instantiating array//    pronounce=>  instashiating
        arr = new int[4];//[0,0,0,0]
        arr[0] = 100;//[100,0,0,0]

        //instantiating arrayList
        list1 = new ArrayList<>();//size 0
        list1.add( 100 );//size 1
        list1.remove( 0 );//size 0

        int number = 50;
        list1.add( number );//autoboxing
        System.out.println( "list1 = " + list1 );
      list1.get( 0 );//wrapper class Integer
        //number still primitives
// instantiating array with specific value
        int[] arr2 = {1, 2, 3};//[1,2,3]
        Integer[] arr3 = {1, 2, 3};

        // instantiating arrayList with specific value
        ArrayList<Integer> list3 = new ArrayList<>( Arrays.asList( 1, 2, 3, 4 ) );

        ArrayList<Integer> listIn = new ArrayList<>( Arrays.asList( arr3 ) );//only if before arr3 is Integer, not int

        System.out.println("*******************");
        //Own methods of ArrayList

        int[] arr4 = {100,200,300};
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4));

        int length = arr4.length;//3
        list5.add(20);

        //using utility classes
        //arr4.sort();
        Arrays.sort(arr4);

        //list5.reverse();
        Collections.reverse(list5);



    }
}
