package day1_keep_all_folders.homework.homeworkFeb16;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number based on the language you wanna use?" +
                "\n For English press 1\n For Spanish press 2\n For Turkish press" +
                " 3\n For Russian press 4 \n For French press 5");
        int number = input.nextInt();
        if (number==1){
            System.out.println("hello, thank for your call");}
        if (number==2){
            System.out.println("hola, gracias para llamar");}
        if(number==3){
            System.out.println("merhaba, aradiginiz icin tesekkurle");}
        if (number==4){
            System.out.println("privet, spasibo za vash zvonok");}
        if (number==5){
            System.out.println("Merci ,pour votre appel");}
        else {
            System.out.println("We will use English by default");
        }}}

    //create a class ChooseLanguage
    //ask the user to enter a number based on the language they wanted to use.
    //1 - English
    //2 - Spanish
    //3 - Turkish
    //4 - Russian
    //5 - French
    //based on the number they picked print a message:
    //1 : "hello, thank for your call"
    //2 : "hola, gracias para llamar"
    //3 : "merhaba, aradiginiz icin tesekkurler"
    //4 : "privet, spasibo za vash zvonok"
    //5 : "Merci ,pour votre appel"
    //any other number: "We will use English by default"
    //-------------------------------------------------------

