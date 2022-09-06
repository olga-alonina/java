package OH.OH_23_24.browserTask;

public class browser {
    public String version;
   /* public browser (String version){
        this.version = version;
    }*/

    public void openBrowser() {
        System.out.println( " opening  browser" );
    }

    public void closeBrowser() {
        System.out.println( " closing browser" );
    }

    public final void navigate(String url) {
        System.out.println( "Type" + url );
        System.out.println( "Press Enter" );
    }

    public final void backward() {
        System.out.println( "backward" );
    }

    public final void refresh() {
        System.out.println( "Refrashing" );
    }

    public final void forward() {
        System.out.println( "forward" );
    }
}
