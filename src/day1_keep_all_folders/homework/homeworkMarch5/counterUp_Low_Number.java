package day1_keep_all_folders.homework.homeworkMarch5;

public class counterUp_Low_Number {
    //Ex:
    //Input: 2juMp41EEkd4s4
    //Output:
    //3 uppercase letters
    //6 lowercase letters
    //5 numbers
    public static void main(String[] args) {
        String sent = "2juMp41EEkd4s4";
        //             0123
        int counterUp = 0;
        int counterLow = 0;
        int counterNumb = 0;
        for (int i = 0; i < sent.length(); i++) {

            char c = sent.charAt(i);//4

            if (c >= 'a' && c <= 'z') {//1
                counterLow++;
            } else if (c >= 'A' && c <= 'Z') {//2
                counterUp++;
            } else if (c >= '0' && c <= '9') {//1
                counterNumb++;//3
            }
        }
        System.out.println(counterUp+" upper case"); //6
        System.out.println(counterLow+" lower case");
        System.out.println(counterNumb+" numbers");

    }
}
