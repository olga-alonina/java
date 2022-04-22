package day1_keep_all_folders.March.March20_day33;

public class Email {
    public static void bild_Email(String name,String domain) {
       String email = name.substring(0,1);
       int space = name.indexOf(" ");
       domain= domain.toLowerCase();
       email+= name.substring(space+1,space+4);
       email+="@"+domain+".com";
        System.out.println(email);

    }

    public static void main(String[] args) {
        bild_Email("Olga Alonina", "Gmail");
    }
}
