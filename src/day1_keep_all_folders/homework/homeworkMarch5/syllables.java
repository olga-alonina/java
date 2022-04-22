package day1_keep_all_folders.homework.homeworkMarch5;

public class syllables {
    public static void main(String[] args) {
        String sent = "pne1 um2 ono3 ul4 tra5 mic6 ros7 cop8 ic9 si10 li11 co12 vol13 ca14 no15 co16 ni17 os18 is19";
        int counter = 0;
        String letters = " ";

        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i) == 'a' || sent.charAt(i) == 'e' || sent.charAt(i) == 'o' || sent.charAt(i) == 'i' || sent.charAt(i) == 'u'
                    || sent.charAt(i) == 'y') {
                counter++;
            }
        }
        System.out.println("Counter "+counter);
    }
}
