package day1_keep_all_folders.homework.Homework_April_13;

import java.util.ArrayList;
import java.util.Arrays;


public class imagination {
    public static void main(String[] args) {
        //
        //int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};//1
        //int[] inhabitants = {0, 7, 0, 24, 12, 0, 15, 7};//2
       //int[] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};//3
        int[] inhabitants = {25, 10, 24, 0, 15, 20, 10, 4};
        int count = 0;
        int sum = 0;
        System.out.println( "Day " + count + " " + Arrays.toString( inhabitants ) );
        ArrayList<Integer> day;

        do {
            day = new ArrayList<>();
            adjustInhabitants( inhabitants, day );
            count++;
            System.out.println( "Day " + count + " " + day );
        } while (checkIfMoreDays( inhabitants, day ));
    }
    private static boolean checkIfMoreDays(int[] inhabitants, ArrayList<Integer> day) {
        int sum = getSum( day );
        if (sum  != 0) {
            moveDayToInhibitants( inhabitants, day );
            return true;
        }
        return false;
    }

    private static void moveDayToInhibitants(int[] inhabitants, ArrayList<Integer> day) {
        for (int j = 0; j < day.size(); j++) {
            inhabitants[j] = day.get( j );
        }
    }

    private static void adjustInhabitants(int[] inhabitants, ArrayList<Integer> day) {
        for (int i = 0; i < inhabitants.length; i++) {
            checkIndZero( inhabitants, day, i );
            checkInd1ToLast( inhabitants, day, i );
            checkLastInd( inhabitants, day, i );
        }
    }

    private static int getSum(ArrayList<Integer> day) {
        int sum =0;
        for (Integer integer : day) {
            sum += integer;
        }
        return sum;
    }

    private static void checkLastInd(int[] inhabitants, ArrayList<Integer> day, int i) {
        if (i == inhabitants.length - 1) {
            if (inhabitants[i - 1] == 0) {
                day.add( inhabitants[i] / 2 );
            } else {
                if (day.size() > i) {
                    day.set( i, inhabitants[i] );
                } else {
                    day.add( i, inhabitants[i] );
                }
            }
        }
    }

    private static void checkInd1ToLast(int[] inhabitants, ArrayList<Integer> day, int i) {
        if (i > 0 && i < inhabitants.length - 1) {
            if (inhabitants[i + 1] == 0) {
                day.add( 0 );
                if (day.size() > i) {
                    day.set( i, inhabitants[i] / 2 );
                } else {
                    day.add( i, inhabitants[i] / 2 );
                }
            } else {
                if (day.size() > i) {
                    day.set( i, inhabitants[i] );
                } else if (day.size() == i && inhabitants[i - 1] == 0) {
                    day.add( i, inhabitants[i] / 2 );
                } else if (day.size() == i && inhabitants[i - 1] != 0) {
                    day.add( i, inhabitants[i] );
                } else {
                    day.add( i, inhabitants[i] / 2 );
                }
            }
        }
    }

    private static void checkIndZero(int[] inhabitants, ArrayList<Integer> day, int i) {
        if (i == 0 && inhabitants[i] == 0) {
            day.add( 0 );
            day.add( 1, inhabitants[i + 1] / 2 );
        } else if (i == 0 && inhabitants[i] != 0) {
            if (inhabitants[i + 1] == 0) {
                day.add( 0, inhabitants[i] / 2 );
            } else {
                day.add( 0, inhabitants[i] );
            }
        }
    }
}



