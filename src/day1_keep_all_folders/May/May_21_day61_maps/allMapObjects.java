package day1_keep_all_folders.May.May_21_day61_maps;

import java.util.*;

public class allMapObjects {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("saim", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("aysun", "ui testing");
        map.put("nadir", "soft skills");
        map.put("username", "password");
        map.put(null, "nothing");
        System.out.println(map);
        System.out.println("LinkedHasMap");
        Map<String,String> linked= new LinkedHashMap<>();
        linked.put("saim", "java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("aysun", "ui testing");
        linked.put("nadir", "soft skills");
        linked.put("username", "password");
        linked.put(null, "nothing");
        System.out.println(linked);
        System.out.println("TreeMap");
        Map<String,String> treeMap= new TreeMap<>();
        treeMap.put("saim", "java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("aysun", "ui testing");
        treeMap.put("nadir", "soft skills");
        treeMap.put("username", "password");
        treeMap.put("pass", null);
      //treeMap.put(null, "nothing"); //not be null as a key. but works with "null"
        System.out.println(treeMap);
        System.out.println("HashTable");
        Map<String,String> hashTable= new Hashtable<>();
        hashTable.put("saim", "java");
        hashTable.put("hello", "world");
        hashTable.put("james", "bond");
        hashTable.put("aysun", "ui testing");
        hashTable.put("nadir", "soft skills");
        hashTable.put("username", "password");
        //treeMap.put(null, null); //not be null as a key or value
        System.out.println(hashTable);
    }
}
