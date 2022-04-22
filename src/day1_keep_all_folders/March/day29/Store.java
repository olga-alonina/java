package day1_keep_all_folders.March.day29;

public class Store {
    public static void main(String[] args) {
        String[] items = {"Ipod", "Backpack","Shoes","Gloves", "Jackets", "AirPod"};
        double[] prices = {89.99, 150.0, 1999.99, 250.0, 439.5, 1339.99};
        int[] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};
        for (int i = 0; i < items.length; i++) {
            System.out.println("Iten ID " + itemIds[i] + " is " + items[i] + " and its cost $ " + prices[i]);
            System.out.println("**************");
            int indexOfGloves=-1;//if we do not have gloves, answer will be -1, as we declare here.
            for (int i1 = 0; i1 < items.length; i1++) {
                if (items[i1].equalsIgnoreCase("gloves")) {
                    indexOfGloves=i1;
                    System.out.println("indexOfGloves = " + indexOfGloves);
                    System.out.println("*********");

                    double expensive = prices[0];
                    int count = 0;
                    for (int i2 = 0; i2 < prices.length; i2++) {
                        if(prices[i]>expensive){
                           expensive= prices[count];
                            count++;
                        }
                    }
                    System.out.println("expensive = " + expensive);
                }
            }
        }
    }
}

