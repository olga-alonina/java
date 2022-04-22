package day1_keep_all_folders.homework.homeworkFeb16;

public class newTry {
    public static void main(String[] args) {
        int time = 11;
        double price;
        if(time >= 10 && time <= 15){
            price = 7.99;
        }
        else {
            price = 10.99;
        }
        System.out.println(price);
        System.out.println("***************");
        double price2 = (time >= 10 && time <= 15) ? 7.99 : 10.99;
        System.out.println(price2);
    }
}
