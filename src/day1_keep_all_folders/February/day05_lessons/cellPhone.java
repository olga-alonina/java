package day1_keep_all_folders.February.day05_lessons;

public class cellPhone {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model = "Tablet1";
        String color = "black";
        int price = 700;
        int storage = 10;
        boolean hasCamera = true;
        char sim1 = 'a';
        char sim2 = 'b';
        char sim3 = 'c';
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price+ "$");
        System.out.println("storage = " + storage);
        System.out.println("hasCamera = " + hasCamera);
        System.out.println("sim1 = " + sim1);
        System.out.println("sim2 = " + sim2);
        System.out.println("sim3 = " + sim3);
        String total = "I have "+ brand +" model "+ model+" with "+color+ " color,and "+storage+" GB storage,\n " +
                "I buy it for " + price+ " $,its "+hasCamera+ " that this phone has camera. Sim is " + sim2+" type.";
        System.out.println(total);

           }
    
}
