package Mehmet.OH_1_12;

public class Many_Hi {
    /*Task 1 :    Write a method that accepts a string and a non-negative number,
            	and prints a larger string that is number copies of the original String*/
    /* stringTimes("Hi", 2); = > HiHi
                stringTimes("Hi", 3); = > HiHiHi
                stringTimes("Hi", 1); = > Hi*/

    public static void count_Hi(int number, String str) {
        for (int i = number; i > 0; i--) {
            System.out.print(str);
        }
    }

    public static void main(String[] args) {
        count_Hi(2,"Hi");
    }
}
