package day1_keep_all_folders.homework.HomeworkMarch6;


public class count_triplets_R {
    //Ex:
    //  Input:
    //    xxxabyyyycd
    //
    //  Output:
    //    3
    public static void main(String[] args) {
        //  Scanner scan = new Scanner(System.in);
        String str = "222abyyycdXXX";

        String counter = "";
        char c = str.charAt(0);
        int counter3 = 0;
        int counter2 = 0;
        String result = "";

        for (int k = 0; k < str.length(); k++) {

            if (c == str.charAt(k)) {
                counter += c;
            } else {
                if (counter.length() == 3) {
                    counter2++;
                } else if (counter.length() >= 3) {
                    counter3 += counter.length() - 2;
                }
                c = str.charAt(k);
                counter = "" + c;

            }
        }
        if (counter.length() >= 3) {
            counter3 += counter.length() - 2;
        }
        int total_counter = counter2 + counter3;
        System.out.println("Total counter " + total_counter);
    }
}