package day1_keep_all_folders.homework.homeworkFeb16;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which attempt it is ?");
        int attempt_number = input.nextInt();
        int grade = 100;
        if(attempt_number==1){
            grade *=0.9;}
        if(attempt_number==2){
            grade*=0.8;}
        if(attempt_number==3){
            grade*=0.65;}
        System.out.println("Your final grade is "+ grade);
        }}



