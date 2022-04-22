package day1_keep_all_folders.February.day8_operator_example;

public class allOperators {
    public static void main(String[] args) {
        System.out.println(5+2*3);
        System.out.println(5*2+4/2);//10+4/2 10+2 12
        System.out.println(5+2>4-3);//7>4-3 7>1 true

        int a = 20;//20->19->20-> 19->18
        int b = -a-- + a++ + --a*a--;
        //      -20  + 19  +   19*19
        //      -20+19+361
        System.out.println("b = " + b);


    }
}
