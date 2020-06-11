import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNG {

    WebDriver driver = null;
    String url = "https://www1.oanda.com/currency/converter/";




    @BeforeTest
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }


    @Test
    public void test1(){
        WebElement fromCountry = driver.findElement(By.id("quote_currency_input"));
        WebElement toCountry = driver.findElement(By.id("base_currency_input"));
        WebElement amount = driver.findElement(By.id("quote_amount_input"));
        WebElement transferAmount = driver.findElement(By.id("base_amount_input"));

        Select drpFromCountry = new Select(fromCountry);
        Select drpToCountry = new Select(toCountry);
        drpFromCountry.selectByVisibleText("US Dollar");
        amount.sendKeys("100");
        drpToCountry.selectByValue("Indian Rupee");
        String iTAmount = transferAmount.getText();
        Assert.assertTrue(!iTAmount.isEmpty());
    }



}
