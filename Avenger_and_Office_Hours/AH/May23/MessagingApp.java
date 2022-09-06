package AH.May23;

public abstract class MessagingApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private int count;

    public static final String APP_TYPE() {
        return null;
    }

    public MessagingApp() {
        System.out.println("Messaging app no-args constructor.. ");
    }

    public MessagingApp(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public abstract void sendMessage(String msg);

    public static void close() {
        System.out.println("Messaging app no-args is closing");
    }

    void launch() {
        System.out.println("Messaging app no-args is launching.. ");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MessagingApp{" +
                "name='" + name + '\'' +
                ", isFree=" + isFree +
                ", allOSCompatible=" + allOSCompatible +
                ", count=" + count +
                '}';
    }
}

