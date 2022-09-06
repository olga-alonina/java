package OH.OH_31_32;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Integer[]nums = {1,3,2,5,6,5,6,5,2,5};
      ArrayList<Integer> integers = new ArrayList<>( Arrays.asList( nums ) );
        System.out.println(" --- ARRAYLIST ---");

        ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(nums));
        System.out.println(arraylist);
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.size());


        System.out.println(" --- LINKEDLIST  ---");

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(nums));
        System.out.println(linkedList);
        linkedList.addFirst(0);
        linkedList.addLast(100);
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList);

        System.out.println(" --- VECTOR  ---");
        Vector<Integer> vector = new Vector<>(Arrays.asList(nums));
        System.out.println(vector);
        System.out.println("vector.get(0) = " + vector.get(0));
        System.out.println(vector.size());
        vector.add(10);
        vector.remove(9);
        vector.remove(8);
        System.out.println("-------");
        System.out.println(vector);

        System.out.println("**********Stack*************");
        // Stack<Integer> stack1 = new Stack<>(Arrays.asList( nums ));//no constraction ->Arrays.asList( nums )
         /*
            List<Integer> list = new Stack<>();
            list.pop();
            list.push();
            Reference type will decide which methods are accessible
            ((Stack) list).push();
         */
        Stack<Integer> stack = new Stack<>();
        stack.addAll( Arrays.asList( nums ) );
        System.out.println( "stack = " + stack );
        System.out.println( "stack.get( 0 ) = " + stack.get( 0 ) );
        System.out.println( "stack.size() = " + stack.size() );
        System.out.println( "stack.search( 5 ) = " + stack.search( 5 ) );
        //push()
        stack.push( 10 );
        System.out.println(stack);
        //pop()
        Integer a  = stack.pop();//remove last element from stack and return it
        System.out.println("a= "+a);


    }
}
