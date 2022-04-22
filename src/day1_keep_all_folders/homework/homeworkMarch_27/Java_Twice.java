package day1_keep_all_folders.homework.homeworkMarch_27;

public class Java_Twice {
    public static void main(String[] args) {
        /*
Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string*/
        /*Ex:	str = "JAVA java";
        output:	true*/
        String str = "JAVA java";
        int countUC = 0;
        int countLC = 0;
        boolean equal = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                countUC++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLC++;
            }
        }
        if (countUC == countLC) {
            equal = true;
        }
        System.out.println(equal);
    }

}

