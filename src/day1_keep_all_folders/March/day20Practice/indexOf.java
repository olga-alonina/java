package day1_keep_all_folders.March.day20Practice;

public class indexOf {
    public static void main(String[] args) {
        String word1 = "apple";
        int number = word1.charAt(0);//97 ==a
        int num2 = word1.indexOf('e');
        int num3 = word1.indexOf("pl");
        int num4 = word1.indexOf('p',3);
        System.out.println(number+"," +num2+","+num3+","+num4);
        int num5 = word1.lastIndexOf('e');
        System.out.println(num5+"\n****************************");
        String word = "banana";
        //             012345
        int n1 = word.indexOf('a');//first letter
        System.out.println(n1);

        int n2 = word.lastIndexOf('a');//last letter
        System.out.println(n2);

        int n3 = word.indexOf('a',n1+1);//second letter
        System.out.println(n3);
        int n4 = word.indexOf('a',n3+1);//third letter
        System.out.println(n4);
    }
}
