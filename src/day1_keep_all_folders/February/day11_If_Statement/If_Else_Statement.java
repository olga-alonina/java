package day1_keep_all_folders.February.day11_If_Statement;

public class If_Else_Statement {
    public static void main(String[] args) {
       int year = 2022;
        boolean lockdown = year ==2020||year==2021;
        if(lockdown){
            System.out.println("Stay at home");
            System.out.println("Wear a mask");
            System.out.println("Practice java");}
        else{
            System.out.println("Party");
            System.out.println("Travel");
            System.out.println("Still practice java");
       }
    }
}
