package day1_keep_all_folders.May.May_21_day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList( 2, 3, 4, 56, 8, 6, 5, 2, 3, 5, 2, 3, 2, 6 ) );
//        for (int i = 0; i < list.size() ; i++) {//doesn't work, mess the indexes
//            if(list.get( i )<5){
//                list.remove( i );
//        for (int each : list) {//doesn't work, mess the indexes
//            if (each < 5) {
//             list.remove(each);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()<=5){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
