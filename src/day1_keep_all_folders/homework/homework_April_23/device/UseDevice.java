package day1_keep_all_folders.homework.homework_April_23.device;

public class UseDevice {
    public static void main(String[] args) {
        TV obj = new TV( "Amaha","Grey" );
         obj.useDevice();
        System.out.println("****Phone****");
        Phone obj1 = new Phone( "Apple","X" );
        obj1.useDevice();
    }
}
