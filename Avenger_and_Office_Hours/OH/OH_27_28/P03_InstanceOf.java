package OH.OH_27_28;

import OH.OH_27_28.browserTask.ChromeDriver;
import OH.OH_27_28.browserTask.SafariDriver;
import OH.OH_27_28.browserTask.WebDriver;

public class P03_InstanceOf {
    public static void main(String[] args) {
        WebDriver driver=DriverUtil.getWebDriver("safari");

        if(driver instanceof SafariDriver){
            ((SafariDriver) driver).fast();
            ((SafariDriver) driver).secure();
            ((SafariDriver) driver).talk();
        }

        System.out.println("--------------------------");

        WebDriver driver2=DriverUtil.getWebDriver("firefox");
        // WebDriver driver =new FirefoxDriver();

        if(driver2 instanceof ChromeDriver){
            ((ChromeDriver)driver2).get("www.google.com");
        } else if (driver2 instanceof SafariDriver) {
            ((SafariDriver) driver2).secure();
        }else {
            driver2.get("www.google.com");
        }

    }
}