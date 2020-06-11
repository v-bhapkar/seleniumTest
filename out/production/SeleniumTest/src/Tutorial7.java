import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Tutorial7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    /*    driver.get("http://demoqa.com/menu/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        Actions actions = new Actions(driver);
        WebElement linkMusic = driver.findElement(By.id("ui-id-9")); // Mouse Hover
        actions.moveToElement(linkMusic).perform();

        WebElement linkRock = driver.findElement(By.id("ui-id-10")); // Mouse Hover
        actions.moveToElement(linkRock).perform();

        WebElement linkClassic = driver.findElement(By.id("ui-id-12")); // Click
        linkClassic.click();


        driver.get("https://demoqa.com/slider/");

        Actions actions1 = new Actions(driver);

        WebElement sliderSlider = driver.findElement(By.id("slider"));
        actions1.moveToElement(sliderSlider, 50, 0).perform();
        sliderSlider.click();*/


        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Actions actions2 = new Actions(driver);

        WebElement linkMenuMore = driver.findElement(By.xpath("//li[@class='moreItem menu_More']"));
        actions2.moveToElement(linkMenuMore).perform();

        WebElement linkBlog = driver.findElement((By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div/div/nav/ul/li[10]/div/a[5]")));
        linkBlog.click();





    }
}
