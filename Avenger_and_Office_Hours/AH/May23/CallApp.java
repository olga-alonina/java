package AH.May23;

public class CallApp extends MessagingApp implements VoiceCallable {
    @Override
    public void call(String contact) {
        System.out.println("CallApp is calling");
    }

    @Override
    public void accept() {

    }

    @Override
    public void sendMessage(String msg) {
        System.out.println( "CallApp sending msg" + msg + "...." );
    }
}
