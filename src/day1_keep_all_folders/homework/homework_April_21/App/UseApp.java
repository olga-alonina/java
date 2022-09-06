package day1_keep_all_folders.homework.homework_April_21.App;

public class UseApp {
    public static void main(String[] args) {
        App ol = new App( "Mc", 4.33 );
        ol.download( "Mc", 5.55 );
        System.out.println( "********" );
        Instagram la = new Instagram( 16.05 );
        la.postPicture();
        System.out.println( "**********" );
        Youtube cla = new Youtube(  5.68 );
        cla.watchVideo();
    }
}
