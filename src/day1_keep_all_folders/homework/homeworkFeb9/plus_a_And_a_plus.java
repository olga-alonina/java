package day1_keep_all_folders.homework.homeworkFeb9;

public class plus_a_And_a_plus {
    public static void main(String[] args) {
        int b = 10;
        b++;
        System.out.println(b);//11
        System.out.println("*************************");
        b--;//11->10
        System.out.println(b);//10
        System.out.println("*************************");
        System.out.println(b++);//10
        System.out.println("*************************");
        System.out.println(b++);//11
        System.out.println("LESSON2");

        int a = 40;
        System.out.println(--a);//39 //predecrament make it right away
        System.out.println("*************************");
        System.out.println(--a);//38 //predecrament make it right away
        System.out.println("*************************");
        System.out.println(a--);//38 //postdecrament post 38, after it -1;

        System.out.println("*************************");
        System.out.println(--a);//36//37 from last line,postdecrament post 37, after it -1;
        System.out.println("*************************");
        System.out.println(--a);//35//36 from last line, predicrament -1 right away
        System.out.println("*************************");
        System.out.println(a--);//35//35 from last line, postdecrament post 35, after it -1;
        System.out.println("Lesson 3");
        int c = 14;
        c--;//14
        c++;//13->14
        --c;//13
        c--;//13
        c++;//13->12
        System.out.println(c);//13




    }
}
