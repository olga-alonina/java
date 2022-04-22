package day1_keep_all_folders.homework.HomeworkMarch6;


public class return_Spaces {

    public static void main(String[] args) {

        String word = "more words";
        word = word.trim().toLowerCase();

        int counLet = 0;
        String btw = "";
        String total = "";


        for (int i = 0; i < word.length(); i++) {
            btw += word.charAt(i);

           if (word.charAt(i) == ' ') {
                counLet++;
                if (counLet >= 2) {
                    btw = btw.charAt(0) + btw.substring(1);
                }
                total += btw;
                btw = "";
            }
        }

        btw = btw.charAt(0) + btw.substring(1);
        total += btw;

        if (total.contains(" ")) {
            total = total.replaceAll(" ", "_");
            total = total.replaceAll("", " ");
        } else {
            total = total.replaceAll("", " ");
        }


        System.out.println(total);

        System.out.println("**********************");

        String str = "more words".trim();
        String fixed = "";

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) == ' ') {
                fixed += "_ ";
            } else {
                fixed += str.charAt(i) + " ";
            }
        }

        System.out.println("Other example");
        System.out.println(fixed.trim());
    }
}
