package day1_keep_all_folders.homework.homeworkMarch9;

public class Prime_From50 {
    public static void main(String[] args) {
        /*Given a number. Print out all the prime numbers from
        2 to that number A prime number is a number that is only divisible by 1 and itself.
         Input: 		50	Output:		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47*/
        int range = 50;

        for (int i = 2; i <= range; i++) {
            int line = 0;
            for (int num = 2; num < i; num++) {
                if (i % num == 0) {
                    line++;

                }

            }if (line==0){
                System.out.print(i + " ");
            }

        }


    }

}




