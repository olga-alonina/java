package Team_task;

public class Ahmad {
    public static void main(String[] args) {
        String s ="Fred";
        String r = "";
        int i = 0;
        while (i < s.length()) {
            char c=s.charAt(i);
            r+=c;
            i++;

        }
        System.out.println("r = " + r);
    }
}
