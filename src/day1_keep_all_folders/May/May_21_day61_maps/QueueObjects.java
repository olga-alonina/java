package day1_keep_all_folders.May.May_21_day61_maps;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer( "hello" );
        queue.offer( "world" );
        queue.offer( "java" );
        queue.offer( "selenium" );
        queue.offer( "apple" );
        queue.offer( "zebra" );
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println("*****************");
          queue.offer( "apple" );
        System.out.println(queue);
        System.out.println("*****************");
        ArrayDeque<String>arrayDeque = new ArrayDeque<>();
        arrayDeque.offer( "hello" );
        arrayDeque.offer( "world" );
        arrayDeque.offer( "java" );
        arrayDeque.offer( "selenium" );
        arrayDeque.offer( "apple" );
        arrayDeque.offer( "zebra" );
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        System.out.println("****************");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekLast());
        System.out.println("*************");
        arrayDeque.offerFirst( "new word " );
        System.out.println(arrayDeque);
    }
}
