package homeworl_April_21.App;

public class UseApp {
    public static void main(String[] args) {
        App ol = new App( "Mc", 4.33 );
        ol.download( "Mc", 5.55 );
        System.out.println( "********" );
        Instagram la = new Instagram( "Pic", 1605 );
        la.postPicture();
        System.out.println( "**********" );
        Youtube cla = new Youtube( "Vid", 568 );
        cla.watchVideo();
    }
}
