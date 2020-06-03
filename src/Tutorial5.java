import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Tutorial5 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


       // Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
     //   drpCountry.selectByVisibleText("Chad");

       Select drpCalender = new Select(driver.findElement(By.name("country")));
       drpCalender.selectByVisibleText("INDIA");

        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);





    }
}
