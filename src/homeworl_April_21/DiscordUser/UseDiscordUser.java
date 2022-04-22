package homeworl_April_21.DiscordUser;

public class UseDiscordUser {
    public static void main(String[] args) {
        DiscordUser newbie = new DiscordUser( "Admin",
                "Vasya", 123 );
        System.out.println( newbie );
        Admin newbie1 = new Admin( "Admin",
                "Helga", 124 );
        newbie1.createChannel();
        Student newbie2 = new Student( "Student ",
                "Helen", 125 );
        newbie2.sendMessage();
    }
}
