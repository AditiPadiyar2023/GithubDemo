package Pages;
import Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Page1 extends Browser{

    public static void searchTextBox(String data)
    {
        driver.findElement(By.id("APjFqb")).sendKeys(data);
        //break;
    }
    public static void select(String data)

    {
        driver.findElement(By.id("APjFqb")).sendKeys(data);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("G43f7e")));
        List<WebElement> link = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
        for (int i= 0;i<link.size();i++)
            if (link.get(i).getText().equalsIgnoreCase(data)) {
                link.get(i).click();
                break;
            }



    }
}
