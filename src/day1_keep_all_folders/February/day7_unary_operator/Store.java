package day1_keep_all_folders.February.day7_unary_operator;

public class Store {
    public static void main(String[] args) {
        String store = "Target";
        int numberOfTV = 100;
        System.out.println("Person comes into the store and they bought TV");
        System.out.println("Number of tvs now = " + --numberOfTV);

        System.out.println("Person comes into the store and they bought TV");
        System.out.println("Number of tvs now= " + --numberOfTV);

        System.out.println("Person comes into the store and they put tv on the cart TV");
        System.out.println("Number of tvs now= " + numberOfTV--);

        System.out.println("Person bouht it, now i have:"+numberOfTV);
        System.out.println("I get s shipment");
        numberOfTV = numberOfTV+13;
        System.out.println("Tvs in stock = " + numberOfTV);


    }
}
