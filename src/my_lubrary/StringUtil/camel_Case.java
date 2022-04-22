package my_lubrary.StringUtil;

public class camel_Case {

    public static void main(String[] args) {
        System.out.println(camelCase2("JAVA will ruLE tHe wORLd"));
        System.out.println("*********");
        System.out.println(camel_Case("JAVA will ruLE tHe wORLd"));
    }

    public static String camelCase2(String sentence) {
        String[] words = sentence.split(" ");
        String camel = "";
        for (int i = 0; i < words.length; i++) {
            camel += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();

        }
        camel = camel.toLowerCase().charAt(0)+camel.substring(1,camel.length());
        return camel;
    }

    public static String camel_Case(String name) {
        name = name.toLowerCase().trim();
        int count = 0;
        String word = name.substring(0, 1);
        String firstLetter = "";
        String total_word = "";

        total_word = word + total_word;
        for (int i = 0; i < name.length() - 1; i++) {
            firstLetter = "";
            count = 0;

            if (name.charAt(i) == ' ') {//4
                firstLetter += name.toUpperCase().charAt(i + 1);//5
                word = name.substring(1, name.indexOf(' ')) + firstLetter;
                name = name.substring(name.indexOf(' '), name.length());
                name = name.replaceFirst(" ", "");
            } else {
                count++;
            }
            if (count < 1) {
                total_word += word;
                i = 0;
            }
        }
        total_word = total_word + name.substring(1, name.length());
        return total_word;
    }
}


