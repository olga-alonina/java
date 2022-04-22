package homeworl_April_21.App;

public class App {
    String name;
    double version;

    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void download(String name, double version) {
        System.out.println( name + " is downloading version " + version );
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
