package day1_keep_all_folders.homework.homeworkMarch12;

public class initials {
    public static void main(String[] args) {
        String[] names = {"James Bond", "Eve Rell", "Anna Johnson"};
        String initial = "";
        for (int i = 0; i < names.length; i++) {
            String s = names[i];
            initial = "" + s.charAt(0) + s.charAt(s.indexOf(" ") + 1);
            System.out.println(names[i]+"'s initials are " + initial);
        }

    }
}
