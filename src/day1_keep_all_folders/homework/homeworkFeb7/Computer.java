package day1_keep_all_folders.homework.homeworkFeb7;

public class Computer {
    public static void main(String[] args) {

        String brand = "lenovo";//
        String processor = "intel";//
        int ramMemory = 16;//
        int storageMemory = 8;//
        boolean hasMonitor = true;//
        boolean hasWifiCard = true;//
        boolean hasDescription = true;//
        double price = 2_500;
        String cpu = "intel";//
        String color = "grey";//
        int numberOfMonitors = 1;//
        int numberOfUsbSlots = 2;//
        boolean hasUsb30 = true;
        System.out.println("I wanna buy computer from "+brand+ ". I wish it has: "+ processor+ " processor,\n"+
                ramMemory+" and "+ storageMemory+ " ram and storage memory,"+cpu+" cpu, "+ color+ " color, only "+
                numberOfMonitors+ " monitor,"+ numberOfUsbSlots+ " usb slots.\n Also it has include: "+ hasMonitor+
                " monitor "+ hasWifiCard+" WIFI card, "+hasDescription+" descripton and "+hasUsb30+ " USB 3.0 slot.\n" +
                " I have only $ "+price+ ", so I'm not interested in other models.");
}

}