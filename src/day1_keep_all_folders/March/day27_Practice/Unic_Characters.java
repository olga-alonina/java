package day1_keep_all_folders.March.day27_Practice;

public class Unic_Characters {
    public static void main(String[] args) {
        String a = "ABBCDDD";

        for (int i = 0; i < a.length(); i++) {
            char let = a.charAt(i);
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                char inner = a.charAt(j);

                if (let == inner) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(let);
            }
        }
    }
}
