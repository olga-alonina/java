package day1_keep_all_folders.March.March27_day37;

public class CountCharacter {
    public static void main(String[] args) {
        String s = "aP3d572&*jd@jdJU";
        int countUC = 0;
        int countLC = 0;
        int countN = 0;
        int others = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                countUC++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                countLC++;
            } else if (Character.isDigit(s.charAt(i))) {
                countN++;
            } else {
                others++;
            }
        }
        System.out.println("countUC =" + countUC + "\ncountLC = " + countLC + "\ncountN =" +
                "" + countN + "\nothers = " + others);
    }
}
