import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial6 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.timeanddate.com/");

        driver.findElement(By.partialLinkText("About us")).click();

        

    }
}
