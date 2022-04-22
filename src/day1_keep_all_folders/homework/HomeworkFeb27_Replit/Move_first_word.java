package day1_keep_all_folders.homework.HomeworkFeb27_Replit;

public class Move_first_word {
    public static void main(String[] args) {
        String sentance = "Java is a fun language";
        int word = sentance.indexOf(" ");
        String str=sentance.substring(word+1);//" is a fun language"

        System.out.println(str+" "+sentance.substring(0,word));

        //Ex:
        //Input: Java is a fun language
        //Output: is a fun language Java
    }
}
