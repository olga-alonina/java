package day1_keep_all_folders.March.day27_Practice;

public class duplicate_character {
    public static void main(String[] args) {
        String a = "ABBCCCCCDEFFF";
        String checked = "";
        for (int i = 0; i < a.length(); i++) {
            if (checked.contains("" + a.charAt(i))) {
                continue;
            }
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(a.charAt(i));
            }
            checked += a.charAt(i);
        }

    }}


