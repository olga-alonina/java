package Mehmet.OH_1_12;

public class wow {
    public static void main(String[] args) {

        String strIn = "abcababcababcab";
        //next line is only there if spaces exist in string, if spaces matter for your solution remove next line
        strIn = strIn.replaceAll(" ", "");
        boolean isSub = false;

        for (int i = strIn.length() / 2; i >= 2; i--) {
            if (strIn.length() % i == 0) {
                String strCopy = "";
                String str = strIn;
                while (str.length() != i) {
                    strCopy = str.substring(0, i);
                    str = str.substring(i);
                    if (!str.contains(strCopy)) {
                        isSub = false;
                        break;
                    } else {
                        isSub = true;
                    }
                }
                if (isSub) {
                    System.out.println(strCopy);
                    break;
                }
            }
        }
        System.out.println(!isSub ? "no substring found" : "");
    }
}

