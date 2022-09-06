package OH.OH_23_24.browserTask;

public class useBrowsers {
    public static void main(String[] args) {
        System.out.println( "********Chrome******************" );
        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.navigate( "www.google.com" );
        chrome.refresh();
        chrome.closeBrowser();
    }
}
