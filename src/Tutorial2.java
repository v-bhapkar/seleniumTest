

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tutorial2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/login.html");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        WebElement txtUserID = driver.findElement(By.id("email"));
        WebElement txtpassword = driver.findElement(By.id("passwd"));
        WebElement btnSubmit = driver.findElement(By.id("SubmitLogin"));

        txtUserID.sendKeys("Vaibhav");
        txtUserID.clear();
        txtUserID.sendKeys("vaibhav.Bhapkar");
        txtpassword.sendKeys("Test-123");
        btnSubmit.click();


    }
}
