package day1_keep_all_folders.homework.homeworkMarch16;

public class Etsy {
    public static void main(String[] args) {
        String nameApp = "Etsy";
        String zone = "us-east-1,us-west-2,us-west-1";
        String[] newZone = zone.split(",");
        String total = "";
        for (String result : newZone) {
            for (int i = 0; i < newZone.length; i++) {
                total=("Deploying " + nameApp + " to " + result + "...\n" +
                        "Deployment completed for " + result + "\n");

            }
            System.out.println(total);
        }
    }
}