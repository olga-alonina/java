package day1_keep_all_folders.June4_day65_stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // Creating Streams

        int [] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 2));
        list.stream();

        // distinct(): remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 4, 4, 5, 5, 6, 1, 1, 2, 2));
        System.out.println("distinct method: " + list2.stream().distinct().collect(Collectors.toList()));
        /*
            .stream() converts the list to a stream
            .distinct() remove duplicate values
            .collect((Collectors.toList()) converts the stream back to a list

            list2 = list2.stream().distinct().collect(Collectors.toList()); // reassigning is fine
         */

        System.out.println("original list " + list2); // original list is the same, not changed

        int [] arr2 = {1, 2, 2, 2, 3, 4, 5, 1, 2, 2, 7, 6, 7, 7, 8};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("array " + Arrays.toString(arr2));

        System.out.println();
        // skip(): skips the defined number of elements
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list3.stream().skip(4).collect(Collectors.toList()));
        System.out.println(list3);
        System.out.println(list3.stream().skip(7).collect(Collectors.toList()));
        System.out.println(list3.stream().skip(13).collect(Collectors.toList()));

        String [] arr3 = {"java", "hello", "world", "pen", "computer"};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(3).toArray()));

        System.out.println();
        // limit(): keeping a certain amount of elements
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println(list4.stream().limit(5).skip(3).collect(Collectors.toList()));
        System.out.println(list4.stream().skip(3).limit(4).collect(Collectors.toList()));

        System.out.println();

        // count
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 5, 6, 3, 5));
        System.out.println(list5.stream().count());
        System.out.println(list5.stream().distinct().count());

        // Task: find how many different letters there is (no about duplicate)
        String s = "aaabbbbccccddddeefggg";
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList())); // i could have also done .toArray() instead of collect method
        System.out.println(Arrays.stream(s.split("")).distinct().count());




    }
}