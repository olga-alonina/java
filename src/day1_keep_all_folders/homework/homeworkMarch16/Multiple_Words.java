package day1_keep_all_folders.homework.homeworkMarch16;

public class Multiple_Words {
    public static void main(String[] args) {
        String input = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] newInput = input.split(", ");
        String result = "";
        for (String each : newInput) {
            if (each.contains(" ")) {
                result += each+"\n";
            }
        }
        System.out.println(result);
    }

}

