package day1_keep_all_folders.homework.homework_April_21.DiscordUser;

public class DiscordUser {
    String role, name;
    int id;

    public DiscordUser(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
