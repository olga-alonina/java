package day1_keep_all_folders.SocialMedia;

public abstract class SocialMedia {
    protected String personalUrl;
    protected int accountLength;
    protected static String platform;
    protected String username;
    protected String password;
    protected String fullName;

    public abstract void directMessage(SocialMedia other, String message);
    public abstract void post(String body);
    public abstract void notification();

    abstract void direct_messaging(String username, String message);

    abstract void Post(Object body);

    abstract void Notifications();
}

