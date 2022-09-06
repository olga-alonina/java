package AH.May23;

public interface VoiceCallable {
    public static final boolean CAN_CALL=true;
    void call(String contact);

    static void decline() {
        System.out.println("Mike declined voice call...");
    }
    default void accept() {
        System.out.println( "Mike finally accepted voice call... " );
    }
}
