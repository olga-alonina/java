package day1_keep_all_folders.February.day8_operator_example;

public class update_variable {
    public static void main(String[] args) {
        // +1 to variable
        int a = 10;
        a++;
        ++a;
        a  = a+1;

        //add10 to variable
        int b = 4;
        //10 times write a++
        b=14;
        b = b+10;
        b+=10;// = b = b+10;

        int count = 0;
        count+=5;//count = count +5
        System.out.println("count = " + count);
        count-=10;//count = count -10
        System.out.println("count = " + count);
        count*=2;
        System.out.println("count = " + count);

    }
}
