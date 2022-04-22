package day1_keep_all_folders.homework.HomeworkMarch6;

public class Prime_number {
    public static void main(String[] args) {
        //Give a number determine if it is a prime number. A prime number
        // is a number that is only divisible by 1 and itself.{loop}
            int num = 10;
            boolean stop = false;
            for (int i = 1; i <= num / 2; ++i) {

                if (num % i == 0) {
                    stop = true;
                    break;
                }
            }

            if (!stop)
                System.out.println("prime");
            else
                System.out.println("not a prime");
        }
    }