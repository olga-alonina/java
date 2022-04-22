package day1_keep_all_folders.homework.homeworkFeb16;

public class TernaryExample {

    public static void main(String[] args) {
        int a = 4;
        String evenOrOdd;
        if(a%2==0){
            evenOrOdd = "Even";}
        else {
            evenOrOdd = "Odd";}
        String result = a%2==0? "Even":"Odd";
        System.out.println(evenOrOdd);
        System.out.println(result);
        System.out.println("*************************");
        int num = 4;
        String posORneg;

        if (num>0){
            posORneg = "positive";
        }
        else if(num<0){
posORneg="negative"; }
        else {
            posORneg = "zero";        }
        System.out.println(posORneg);

        String sign = (num>0)?"positive": (num<0)?"negative":"zero";
        System.out.println("************************");
        int time = 1;
        double price;
        if (time>=10&&time<=15) {
            price = 7.99;}
            else{
                price = 10.99;
            }
            double TernaryPrice = (time >= 10 && time <= 15) ? 7.99 : 10.99;

        }}