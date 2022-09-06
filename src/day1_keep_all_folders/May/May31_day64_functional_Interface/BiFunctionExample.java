package day1_keep_all_folders.May.May31_day64_functional_Interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>maxNumber = (one,two)->{
            return one>two?one:two;
        };

        BiFunction<List<Integer>,List<String>, Map<Integer,String>>createMap=(keys, value)->{
            Map<Integer,String>map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get( i ), value.get(i) );
            }
              return map;
        };//examples
        System.out.println(maxNumber.apply( 5,2 ));
        List<Integer>list = new ArrayList<>( Arrays.asList(1, 2, 3));
        List<String>names = new ArrayList<>(Arrays.asList("Ola","Alex","Max"));
        System.out.println(createMap.apply(list,names  ));
    }
}
