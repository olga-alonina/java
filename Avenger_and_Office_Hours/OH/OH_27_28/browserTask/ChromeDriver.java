package OH.OH_27_28.browserTask;



public class ChromeDriver extends RemoteWebDriver{
    @Override
    public void get(String URL) {
        System.out.println("Opening in Chrome");
    }
}