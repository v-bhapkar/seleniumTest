import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class Tutorial9 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.timeanddate.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // WebElement on Main Navigation menu

        WebElement linkMainMenu = driver.findElement(By.xpath("//*[@id='naw']//*[text()='Home']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(linkMainMenu).perform();

        WebElement linkNewsLetter = driver.findElement(By.xpath("//*[@id='naw']//*[text()='Newsletter']"));

        linkNewsLetter.click();






    }
}
