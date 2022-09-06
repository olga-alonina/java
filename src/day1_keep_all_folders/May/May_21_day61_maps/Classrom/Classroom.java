package day1_keep_all_folders.May.May_21_day61_maps.Classrom;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {
        Map<Integer, Student>map = new HashMap<>();
        map.put(1, new Student( "Olga", 4.0,7 ));
        Student obj = new Student( "Alex",4.5,18  );
        map.put( 2,obj );
        map.put(3, new Student( "Anna", 3.2, 9 ));
        map.put(4, new Student( "Dan", 4.2, 29 ));
        System.out.println(map);
        System.out.println( map.get( 1 ) );
        System.out.println(map.get( 4 ).name);
        System.out.println("Looping through map");
        for(int keys:map.keySet()){
            System.out.println("Rank "+ keys);
            System.out.println(map.get( keys ));
            System.out.println();
        }
        System.out.println(map.values());
        for(Student student:map.values()){
            if(student.id<=10){
                System.out.println(student);
            }
        }
        System.out.println("Another way for loop");
        for(Map.Entry< Integer,Student >entry: map.entrySet()){
            System.out.println("Rank "+ entry);
            System.out.println(entry.getValue());
            System.out.println();
        }
    }
}
