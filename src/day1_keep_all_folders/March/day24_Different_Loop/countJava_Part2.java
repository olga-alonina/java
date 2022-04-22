package day1_keep_all_folders.March.day24_Different_Loop;

public class countJava_Part2 {
    public static void main(String[] args) {
        String str = "java is a java language.java";
        int count = 0;

        while(str.contains("java")){
            str =  str.replaceFirst("java", "*");
            count++;
            System.out.println(str);
        }

        System.out.println(count);
        System.out.println(str);
    }
}
