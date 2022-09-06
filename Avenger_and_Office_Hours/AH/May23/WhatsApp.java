package AH.May23;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable {
    @Override
    public void videoCall() {
        System.out.println( "WhatsApp is making video call" );
    }

    @Override
    public void call(String contact) {
        System.out.println("WhatsApp is calling");
    }

    @Override
    public void accept() {
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println( "WhatsApp sending msg" + msg + "...." );
    }
}
