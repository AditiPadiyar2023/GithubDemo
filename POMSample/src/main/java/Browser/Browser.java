package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public static void getUrl()
    {
        driver.get("https://www.google.co.uk");
        driver.findElement(By.id("L2AGLb")).click();
    }
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
