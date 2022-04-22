package day1_keep_all_folders.March.day22Loop;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colorPick = 0;
        String unicColor = " ";
        while (colorPick < 3) {
            System.out.println("Pick a color");
            String color = input.nextLine();
            System.out.println(color);

            if (unicColor.contains(color)) {
                System.out.println("You already have this color");
            } else {
                unicColor += color + " ";
                colorPick++;
            }
        }
        System.out.println(unicColor);
    }
}
