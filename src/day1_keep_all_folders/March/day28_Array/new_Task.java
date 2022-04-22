package day1_keep_all_folders.March.day28_Array;

public class new_Task {
    public static void main(String[] args) {
        int[] num = {3, 6, 39};
        int summ1 = 0;
        summ1+=num[0]+num[1]+num[2];
        System.out.println("hardcode = "+summ1);//hardcode

        System.out.println("*********************");
        int summ = 0;
        for (int i = 0; i < num.length; i++) {
            summ += num[i];
        }
        System.out.println("loop=" + summ);
    }

}
