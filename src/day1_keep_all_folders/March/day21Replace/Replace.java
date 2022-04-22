package day1_keep_all_folders.March.day21Replace;

public class Replace {
    public static void main(String[] args) {
        String word = "Java is a language";
        word = word.replace('a', 'e');
        System.out.println(word);

        String day = "monday, is monday, today is monday";
        day = day.replace("monday", "tuesday");
        System.out.println(day);

        String tar = "monday. is monday. today is monday";
        int index1 = tar.indexOf('.');
        int index2 = tar.lastIndexOf('.');
        String middleStr = tar.substring(index1,index2);
        middleStr = middleStr.replace("monday", "weekend");
        System.out.println(tar.substring(0, index1)+middleStr+tar.substring(index2));
    }
}
