import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ToolsQAFormSubmission {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://www.demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("userName")).sendKeys("Vaibhav");
        driver.findElement(By.id("userEmail")).sendKeys("vbhpkar@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Pimpri, Pune 411018");
        driver.findElement(By.id("permanentAddress")).sendKeys("Same is above");
        WebElement btnSubmit = driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[5]/div"));
        js.executeScript("arguments[0].scrollIntoView();", btnSubmit);
        btnSubmit.click();
        Assert.assertEquals(!driver.findElement(By.id("output")).getText().isEmpty(), true);
        
    }
}
