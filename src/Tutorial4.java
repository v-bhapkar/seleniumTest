import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tutorial4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        WebElement elementLogo = driver.findElement(By.xpath("//span[@class='hmsprite logo']"));
        WebElement linkNews = driver.findElement((By.className("news")));

        linkNews.click();

        elementLogo.click();

        System.out.println("Main page:= " + driver.getTitle());

        driver.close();
    }
}
