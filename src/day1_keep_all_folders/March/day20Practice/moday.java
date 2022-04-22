package day1_keep_all_folders.March.day20Practice;

public class moday {
    public static void main(String[] args) {
        String word1 = "monday";
        //              012345
        String result = word1.substring(3);
        String result2 = word1.substring(1);
        //String result3 = word1.substring(10);out of number give you mistake
        System.out.println(result);
        System.out.println(result2);

        String res4 = word1.substring(2, 5);
        System.out.println(res4);
        String res5 = word1.substring(2, 6);
        System.out.println(res5);

    }
}
