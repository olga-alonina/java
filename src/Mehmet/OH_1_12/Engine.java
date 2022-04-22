package Mehmet.OH_1_12;

public class Engine {
    public static void main(String[] args) {
        //Input :  "About 640,000,000 results (0.78 seconds)"
        //
        //		Output:
        //					Result number is 640,000,000
        //					Response time is 0.78 seconds
        String sent = "About 640,000,000 results (0.78 seconds)";
        int Start1 = sent.indexOf("640");
        int End1 = sent.lastIndexOf(" re");
        int Start2 = sent.indexOf("0.");
        int End2 = sent.lastIndexOf(")");
        String sent1 = sent.substring(Start1,End1);
        System.out.println("Result number is "+sent1);
        String sent2 = sent.substring(Start2,End2);
        System.out.println("Response time is "+sent2);
    }
}
