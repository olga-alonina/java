package day1_keep_all_folders.homework.homework_April_21.DiscordUser;

public class Student extends DiscordUser {

    public Student(String role, String name, int id) {
        super( "Student", name, id );
    }

    public void sendMessage() {
        System.out.println( "Sending message to class chat" );
    }
}
