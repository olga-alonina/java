package day1_keep_all_folders.March.March19_ArrayMetod_day32;

import java.util.Arrays;

public class Small_groups {
    public static void main(String[] args) {
        String [][] cydeo=new String[4][];
        //String [][] cydeo=new String[4][3];
        // result [[null, null, null], [null, null, null], [null, null, null], [null, null, null]]

        String[] groupOne={"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("adding group 2");
        String[] groupTwo={"Basri", "Demet", "Shina", "Ismail"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("adding group 3");
        String[] groupThree={"Mystafa", "Lima"};
        cydeo[2] = groupThree;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("same group 3 as group 4");
        System.out.println("adding group 3");
        cydeo[3] = cydeo[2];
       // cydeo[3] = groupThree;//same idea
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("*************");
        for (String[]innerArray :cydeo) {
            for (String eachWord:innerArray){
                System.out.println("eachWord = " + eachWord);
            }
        }
    }

}
