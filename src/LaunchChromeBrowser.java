import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.*;
import java.util.concurrent.TimeUnit;

public class LaunchChromeBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.timeanddate.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        String currentTIme = driver.findElement(By.id("clk_hm")).getText();
        System.out.println(currentTIme);

        WebElement txtWorldClock = driver.findElement(By.id("sb_wc_q"));

        txtWorldClock.sendKeys("Wroclaw");
        

    }
}
