package AH.May23;

public class CallCenter_Runner {
    public static void main(String[] args) {
        System.out.println( "******MessagingApp*****" );
        // MessagingApp ma = new MessagingApp();//abstract
        MessagingApp ma1 = new CallApp();
        System.out.println( ma1 );
        ma1.close();
        ma1.setCount( 10 );
        ma1.sendMessage( "Aloha" );
        ma1.APP_TYPE();

        MessagingApp ma2 = new WhatsApp();
        System.out.println( ma2 );
        ma2.close();
        ma2.setCount( 10 );
        ma2.sendMessage( "Aloha" );
        ma2.APP_TYPE();

        System.out.println( "******VoiceCallable*****" );
        //VoiceCallable voiceCallable = new VoiceCallable();//abstract
        VoiceCallable voiceCallable1 = new WhatsApp();
        System.out.println( voiceCallable1 );
        voiceCallable1.accept();
        voiceCallable1.call( "alex" );
        VoiceCallable voiceCallable2 = new CallApp();
        voiceCallable2.accept();
        voiceCallable2.call( "Alex" );
        VoiceCallable.decline();//only with Object name

        System.out.println( "******VideoCallable*****" );
        //VideoCallable videoCallable = new VideoCallable();abstract
        VideoCallable videoCallable1 = new WhatsApp();
        videoCallable1.videoCall();
        //videoCallable1.call("Alex");
        //videoCallable1.accept();

        System.out.println( "******CallApp*****" );
        CallApp callApp = new CallApp();
        callApp.accept();
        callApp.call( "Alex" );

        System.out.println( "******WhatsApp*****" );
        WhatsApp whatsApp = new WhatsApp();
        whatsApp.call( "Alex" );
        whatsApp.videoCall();
        whatsApp.accept();
        whatsApp.launch();
        System.out.println( whatsApp );


    }
}
