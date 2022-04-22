package day1_keep_all_folders.February.day8_operator_example;

public class operator_practice3 {
    public static void main(String[] args) {
        int h = 5;
        int p=h;// p is assigned value h, its 5
        h++;
        System.out.println("p = " + p);//5
        System.out.println("h = " + h);//6

        int k = h++;//post increment. 6, print first, after add +1
        System.out.println("k = " + k);//6
        System.out.println("h = " + h);//7

        int g = ++h;//8
        System.out.println("g = " + g);//8
        System.out.println("h = " + h);//8

    }
}
