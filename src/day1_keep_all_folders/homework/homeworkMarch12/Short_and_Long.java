package day1_keep_all_folders.homework.homeworkMarch12;

public class Short_and_Long {
    public static void main(String[] args) {
        //Shortest and Longest words from String array
        //• Write a program that can return the shortest string element from a
        //String array
        //• Write a program that can return the longest string element from a
        //String array
        String[] numbers = {"9867", "69587", "6995477", "2", "123"};
        System.out.println();
        String min = numbers[0];
        String max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].length() > max.length()) {
                max = numbers[i];
            }
            if (numbers[i].length() <= min.length()) {
                min = numbers[i];

                System.out.println("longest = " + max);
                System.out.println("shortest = " + min);

                System.out.println("*****************");

                for (String word : numbers) {
                    if (word.length() > max.length()) {
                        max = word;
                    }
                    if (word.length() <= min.length()) {
                        min = word;
                    }

                }
                System.out.println("longest = " + max);
                System.out.println("shortest = " + min);
            }
        }
    }
}

