package OH.OH_27_28.browserTask;


public class TestCases {
    public static void main(String[] args) {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        chromeDriver.TakeScreenShot("picture01");
        chromeDriver.close();

        System.out.println("===============");
        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        firefoxDriver.TakeScreenShot("picture02");
        firefoxDriver.close();

        System.out.println("===============");

        SafariDriver safariDriver=new SafariDriver();
        safariDriver.get("https://www.google.com");
        safariDriver.TakeScreenShot("picture03");
        safariDriver.fast();
        safariDriver.talk();
        safariDriver.secure();
        safariDriver.close();

        System.out.println("===============");

        /*
         WebDriver driver=new ChromeDriver();
        ((TakeScreenshot)driver).TakeScreenShot("");
         WebDriver driver2=new SafariDriver();

         */



    }
}