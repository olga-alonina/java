package day1_keep_all_folders.SocialMedia;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures{
    private  int number_of_followers,
            number_of_followings;
    ArrayList<Picture> list = new ArrayList<Picture>();
    static {
        platform = "Instagram";
    }

    public Instagram(int number_of_followers, int number_of_followings, ArrayList<Picture> list) {
        this.number_of_followers = number_of_followers;
        this.number_of_followings = number_of_followings;
        this.list = list;
    }

    public Instagram(String username, String password) {
        this.username =username;
        this.password = password;
        personalUrl= "Instagram.com/"+username;

    }

    @Override
    public void directMessage(SocialMedia other, String message) {

    }

    @Override
    public void post(String body) {

    }

    @Override
    public void notification() {

    }

    @Override
    void direct_messaging(String username, String message) {
        System.out.println( "message sent to" + username );
    }

    @Override
    void Post(Object body) {
        list.add( (Picture) body );

    }

    @Override
    void Notifications() {
        int current_Hour = LocalTime.now().getHour();
        if (current_Hour >= 10 && current_Hour < 20) {
            System.out.println( "Notification" );

        } else {
            System.out.println( "Sleep mode" );
        }
    }

    @Override
    public void likePicture() {
        System.out.println("I like it");
    }

    @Override
    public void unLikePicture() {
        System.out.println("I thought it will be better");
    }

    @Override
    public void sharePicture() {
        System.out.println("You gotta see it");
    }
}
