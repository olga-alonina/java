package day1_keep_all_folders.homework.homeworkMarch1;

public class alphabitAtoZ {
    public static void main(String[] args) {
        //write a program that will print all the alphabet letters in lowercase from 'a' to 'z'
        char c = 'a';
        int i = 0;
        while (i++ < 26) {
            System.out.print(c + " ");
            c++;

        }
        System.out.print("\n*******************\n");
        //write a program that will print all the alphabet letters in uppercase from 'A' to 'Z'
        char a = 'A';
        int num = 0;
        while (num++ < 26) {
            System.out.print(a + " ");
            a++;
        }
        System.out.print("\n*******************\n");
        //write a program that will print all the alphabet letters backwards in lowercase from 'z' to 'a'
        char bacw = 'z';
        int num1 = 26;
        while (num1-->=1) {
            System.out.print(bacw+" ");
            bacw--;
        }
        System.out.print("\n*******************\n");
///write a program that will print all the alphabet letters backwards in lowercase from 'Z' to 'A'
        char bacw2 = 'Z';
        int num2 = 26;
        while (num2-->=1) {
            System.out.print(bacw2+" ");
            bacw2--;
        }
        System.out.print("\n*******************\n");
    }
}
