import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CurrencyConversion {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");
        String url = "https://www1.oanda.com/currency/converter/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("quote_currency_caret")).click();
        String strCurrencyIHave = "Indian Rupee";

        Actions actions = new Actions(driver);
        WebElement currencyIHave = driver.findElement(By.xpath("//div[@id='scroll-innerBox-1']//*[contains(text(),'Indian Rupee')]"));
        actions.moveToElement(currencyIHave).click().perform();


    }
}
