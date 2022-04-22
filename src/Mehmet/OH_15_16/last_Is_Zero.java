package Mehmet.OH_15_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class last_Is_Zero {
    public static void main(String[] args) {
     ArrayList<Integer>list = new ArrayList<>(Arrays.asList( 1,2,3,4,5));
        //output: [1,2,3,4,0];
        System.out.println( "list = " + list );
        System.out.println("1 set the last element of the Integer arraylist to zero");
        list.set( list.size()-1,0 );
        System.out.println( "list1 = " + list );
        System.out.println("2 swap the first and last elements of an ArrayList");
        Collections.swap( list,0,list.size()-1 );
        System.out.println( "list2 = " + list );
        System.out.println("3 multiply each odd number by 2");
          for (int i = 0; i < list.size(); i++) {
            if(list.get( i )%2!=0){
                list.set( i , list.get( i )*2);
                        }
        }System.out.println( "list3 = " + list );

    }
}
