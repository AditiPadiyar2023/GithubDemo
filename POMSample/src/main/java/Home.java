import Browser.Browser;
import Pages.Page1;

public class Home {
    public static void main(String[]args) throws Exception{
        Browser.openBrowser();
        Browser.getUrl();
        Page1.searchTextBox("java");
       Page1.select("tpoint");
    }
}
