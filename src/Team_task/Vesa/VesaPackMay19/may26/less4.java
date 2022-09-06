package Team_task.Vesa.VesaPackMay19.may26;

import java.util.ArrayList;

public class less4 {
    /*Four or lessGiven an ArrayList of Strings, go through and find Strings that are
    4 characters or less. Take those Strings and put them into a different ArrayList.
    Print that ArrayList of wordsEx:Input:“apples”, “tree”, “loop, “cat”, “animal”,
     “shortcut” Output:[ tree, loop, cat ]*/
    public static void main(String[] args) {
        String []str = {"apples", "tree", "loop", "cat", "animal","shortcut"};
        System.out.println(shorter_than4( str ));
    }

    public static ArrayList<String> shorter_than4(String[] str) {
        ArrayList<String> shorter_than4 = new ArrayList<>();
        for (String each : str) {
            if (each.length() <= 4) {
                shorter_than4.add( each );
            }
        }
        return shorter_than4;
    }
}
