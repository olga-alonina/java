package Mehmet.OH_15_16;

public class Sum_oF_Digits {
    public static int sum_oF_Digits(String s) {
        String colNumb = "0";//if i need to convers string to Integer better use "0" than "";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit( s.charAt( i ) )) {
                colNumb += s.charAt( i );
            } else {
                   sum += Integer.parseInt( colNumb );
                    colNumb = "0";
                }
            }

        return (sum+Integer.parseInt( colNumb ));
    }

    public static void main(String[] args) {
        String s = "jav45ai1000sgre1at82";
        System.out.println(sum_oF_Digits( s ));
    }
}

        