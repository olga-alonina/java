package Team_task.interviewPrep;

public class counter_letter {
    public static void main(String[] args) {
        /*You wrote a method for aaaabbcccdda==> a4b2c3d2a
         */
        String str = "aaaabbcccdda";
        String newOne = "";
        int count = 1;
        int i = 0;
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt( i + 1 ) != str.charAt( i )) {
                newOne += str.charAt( i ) + "" + count;
                count = 1;
            } else {
                count++;
            }
        }
        if (i==str.length()-1) {
            newOne += str.charAt(i) + "" + count;
        }
        System.out.println( "newOne = " + newOne );
    }

}




