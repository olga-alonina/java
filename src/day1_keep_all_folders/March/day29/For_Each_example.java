package day1_keep_all_folders.March.day29;

public class For_Each_example {
    public static void main(String[] args) {
        int[] num = {30, 12, 159, 12};
        for (int i = 0; i < num.length; i++) {
            System.out.println("Traditional " + num[i]);
        }
        System.out.println("********************");
        for (int element : num) {
            System.out.println("for each: " + element);

            System.out.println("********************");
String[] classes = {"java", "soft skills", "selenium", "database", "api"};
            for (int i = 0; i < classes.length; i++) {
                System.out.println(classes[i]);
                System.out.println("********************");
                for(String word: classes){
                    System.out.println(word);
                    System.out.println("********************");
                    double[] prices = {10.4, 40.2, 410.2};
                    for (double each:prices) {
                        System.out.println("each $ " + each);

                    }
                }
            }

        }
    }
}

