package Team_task.interviewPrep.mixMarch;

import java.util.ArrayList;
import java.util.Collections;

public class swap {
    public static void main(String[] args) {
        /*Write a program to Team_task.mixMarch.swapEx 2 numbers without using the 3rd (temporary) variable?*/
      
        ArrayList<String> newOne = new ArrayList<>();
        newOne.add("Item 1");
        newOne.add("Item 2");
        newOne.add("Item 3");
        newOne.add("Item 4");
        newOne.add("Item 5");
        System.out.println("newOne.size() = " + newOne.size());

        // display Check_Six List before Team_task.mixMarch.swapEx
        System.out.println("Before Swap the ArrayList ");
        System.out.println(newOne);

        // Swapping the elements at 1 and 4 indexes(2 and 5 element) index starts from 0
        Collections.swap(newOne, 1, 4);//if we wanna swapEx last one (number=size-1)

        // display Check_Six List after swapEx
        System.out.println("After Swap the ArrayList");
        System.out.println(newOne);
    }

}
