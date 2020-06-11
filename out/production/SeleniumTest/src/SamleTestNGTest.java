import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SamleTestNGTest {


    public String baseURL = "http://newtours.demoaut.com/";
    public WebDriver driver;

    @BeforeTest
    public void setBaseURL(){
    System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.get(baseURL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

    }

    @AfterTest
    public void endSession(){
        driver.close();
    }

    @Test
    public void verifyHomePage(){
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle , expectedTitle);

    }

}
