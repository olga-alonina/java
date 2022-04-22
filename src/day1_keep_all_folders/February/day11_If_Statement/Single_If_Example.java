package day1_keep_all_folders.February.day11_If_Statement;

public class Single_If_Example {
    public static void main(String[] args) {

        if(false){
            System.out.println("Hello world");
        }
        System.out.println("Second line");
        if(true) {
            System.out.println("Today is Monday");
        }
        int score = 75;
        if(score>=75){
            System.out.println("You are passed");}
        if (score<75){
            System.out.println("You are failed");}
        int year = 2015;
        boolean lockdown = year ==2020||year==2021;
        if(lockdown){
            System.out.println("Stay at home");}
        if(year>=2020&&year<=2022){
            System.out.println("Stay at home too");}
        if(!lockdown){
            System.out.println("Have a party");}
        }

}






