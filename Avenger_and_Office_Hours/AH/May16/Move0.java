package AH.May16;

import java.util.ArrayList;
import java.util.Arrays;

public class Move0 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 2, 2, 0, 0, 0, 3, 4, 5));
        int number = 0 ;

        System.out.println(moveToEnd(list, number));

    }
    public static ArrayList<Integer> moveToEnd(ArrayList<Integer> list, Integer number){

        int originalSize = list.size();

        list.removeIf(zero -> zero == number);

        //list.removeAll(Arrays.asList(number));

        int newSize = list.size();

        int totalNumOfRemoved = originalSize - newSize ;

        for (int i = 0; i < totalNumOfRemoved; i++) {
            list.add(number);
        }
        return list;
    }
}