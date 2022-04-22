package day1_keep_all_folders.homework.HomeworkMarch6;

public class ID {
    public static void main(String[] args) {
        //Given a first name and last name create and return an id using the following format:
        //	the first letter of the first name as lowercase,
        //	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
        //	the length of the first String multiplied by 2
        //	first name: john  //	last name: smith //	id: jSmi8
        String FN = "john";
        String LN = "smith";
        int part3 = FN.length() * 2;
        String rep = "";

        rep = LN.substring(0, 1).toUpperCase() + LN.substring(1, 3);
        System.out.println("Answer =" + FN.charAt(0) + rep.substring(0, 3) + part3);
    }
}
