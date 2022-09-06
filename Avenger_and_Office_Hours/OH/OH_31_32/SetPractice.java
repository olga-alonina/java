package OH.OH_31_32;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String[] browsers = {"Chrome", "Firefox", "Chrome", "Edge", "IE", "Edge", "Safary", "Remote-Chrome"};
        System.out.println( "********HashSet**********" );
        HashSet<String> hashSet = new HashSet<>( Arrays.asList( browsers ) );
        System.out.println( "hashSet = " + hashSet );
        hashSet.add( null );
        System.out.println( "hashSet after add null = " + hashSet );

        System.out.println( "*****LinkdHashSet****" );
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList( browsers ) );
        System.out.println( "linkedHashSet = " + linkedHashSet );
        linkedHashSet.add( null );
        System.out.println( "linkedHashSet after add null = " + linkedHashSet );
        System.out.println( "******TreeSet********" );
        TreeSet<String> treeSet = new TreeSet<>( Arrays.asList( browsers ) );
        System.out.println( "treeSet = " + treeSet );
        // treeSet.add( null );//does not accept null value
        System.out.println( "treeSet after add null = " + treeSet );
        Integer[]a = {1,2,3,44,3,67,43,2,78,9,8};
        //practice
        //remove duplicates from all cases
         List<Integer> list  = Arrays.asList( a );
        System.out.println( "remove duplicates = " + list );
        System.out.println("************************");
        //Keep insertion order
        System.out.println("insertion order "+new LinkedHashSet<>(list));
        //return 5th element after remove
        System.out.println( "5th element after remove = " + new ArrayList<>( new LinkedHashSet<>( list ) ).get( 4 ) );
        //sort in ascending(0->10) order
        System.out.println("ascending(0->10) order "+ new TreeSet<>(list));
        //sort in descending order
        ArrayList<Integer>sorted_list = new ArrayList<>(new TreeSet<>(list));
        Collections.reverse(sorted_list );
        System.out.println( "descending order sorted_list = " + sorted_list );



    }
}
