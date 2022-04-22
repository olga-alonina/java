package Mehmet.OH_1_12;

public class newOne {
    public static void main(String[] args) {
        System.out.println("not deep");
        deep();
        System.out.println("not deep");
    }

    public static void deep() {
        System.out.println(" deep");
        deeper();
        System.out.println(" deep");
    }

    public static void deeper() {
        System.out.println(" deeper");
    }
}
