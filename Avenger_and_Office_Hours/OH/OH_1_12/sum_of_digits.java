package OH.OH_1_12;

public class sum_of_digits {
    public static void main(String[] args) {
        //input: A1B2C3 // output: 6 // 1+2+3
        String inp = "A3B2C8";
//                    012345
        int sum = 0;
        char letter = 0;


        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += (c - 48);
            }
        }
        System.out.println(sum);
    }
}

