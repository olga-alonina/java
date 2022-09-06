package day1_keep_all_folders.homework.homework_April_21.DiscordUser;

public class Admin extends DiscordUser {

    public Admin(String role, String name, int id) {
        super( "Admin", name, id );
    }

    public void createChannel() {
        System.out.println( "Creating new discord channel" );
    }
}
