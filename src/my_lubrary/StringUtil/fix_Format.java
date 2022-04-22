package my_lubrary.StringUtil;

public class fix_Format {
    /*
Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase*/
    /*	Input: jamES
    Output: James*/
    public static void main(String[] args) {
        System.out.println(fix_Format("jamES"));
    }

    public static String fix_Format(String name) {
        name = name.toLowerCase();
       name = name.toUpperCase().charAt(0)+name.substring(1,name.length());
        return name;
    }

}
