package OH.OH_1_12;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write your animal: ");
        String name = input.nextLine();
switch (name){
    case "Dog":
            System.out.println(name+" is domestic animal");break;
    case "Cat":
            System.out.println(name+" is domestic animal");break;
    case "Tiger":
            System.out.println(name+" is wild  animal");break;
    default:
            System.out.println("unknown animal");
        }
    }
}