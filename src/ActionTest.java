import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionTest {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        Actions action = new Actions(driver);
        WebElement linkWomen = driver.findElement(By.xpath("//a[contains(text(),'Women') and @title='Women']"));
        action.moveToElement(linkWomen).perform();

        WebElement linkSummerDresses = driver.findElement(By.linkText("Summer Dresses"));
        linkSummerDresses.click();
        


    }
}
