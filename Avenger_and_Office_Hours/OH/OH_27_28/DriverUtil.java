package OH.OH_27_28;

import OH.OH_27_28.browserTask.ChromeDriver;
import OH.OH_27_28.browserTask.FirefoxDriver;
import OH.OH_27_28.browserTask.SafariDriver;
import OH.OH_27_28.browserTask.WebDriver;

public class DriverUtil {
    public static WebDriver getWebDriver(String browserName) {
        WebDriver driver;
        switch (browserName) {
            case "chrome":
                // WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "safari":
                // WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;

            case "firefox":
                // WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                System.out.println( "UNKNOWN BROWSER" );
                driver = null;
        }
        return driver;
    }
}