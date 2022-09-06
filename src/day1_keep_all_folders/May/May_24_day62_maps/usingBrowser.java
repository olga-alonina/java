package day1_keep_all_folders.May.May_24_day62_maps;

public class usingBrowser {
    public static void main(String[] args) {
        Browser browser = Browser.Chrome;
        switch (browser){
            case Edge:
            case Chrome:
                System.out.println("Opening Chrome browser");
                break;
            case Safari:
                System.out.println("Opening Safari browser");
                break;
            case Firefox:
                System.out.println("Opening Firefox browser");
                break;
        }
    }
}
