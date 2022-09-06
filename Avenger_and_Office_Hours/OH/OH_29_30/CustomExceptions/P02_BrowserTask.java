package OH.OH_29_30.CustomExceptions;

public class P02_BrowserTask {
    public static void main(String[] args) {

        String browserName = "safari";
        String operatingSystem = "windows";
        boolean isBrowserOpened = false;


        if (!isBrowserOpened) {
            switch (browserName) {
                case "chrome":
                case "chrome-headless":
                case "firefox-headless":
                case "firefox":
                case "remote-chrome":
                    System.out.println( "Browser is opened successfully with " + browserName + " in " + operatingSystem );
                    break;
                case "ie":
                case "edge":
                    if (operatingSystem.equals( "windows" )) {
                        System.out.println( "Browser is opened successfully with " + browserName + " in " + operatingSystem );
                    } else {
                        throw new InvalidBrowserTypeException( "Your " + operatingSystem + " doesn't support " + browserName );
                    }
                    break;
                case "safari":
                    if (operatingSystem.equals( "mac" )) {
                        System.out.println( "Browser is opened successfully with " + browserName + " in " + operatingSystem );
                    } else {
                        throw new InvalidBrowserTypeException( "Your " + operatingSystem + " doesn't support " + browserName );
                    }
                    break;
            }
        } else {
            System.out.println( "Browser is already opened with " + browserName + " in " + operatingSystem );
        }
    }
}
