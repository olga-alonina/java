package day1_keep_all_folders.March.day23LoopAgain;

public class Count_Hi {
    public static void main(String[] args) {
        String wor = "HelloHelloHgjjfhdshdfjglggelloHelloHelloHello ";
        int count = 0;

        for (int i = 0; i < wor.length(); i++) {
            if (wor.charAt(i) == 'H' && wor.charAt(i+1)=='e'&&wor.charAt(i+2)=='l'&&wor.charAt(i+3)=='l'&&wor.charAt(i+4)=='o')
                count++;
            }
        System.out.println("count = " + count);
        }
    }

