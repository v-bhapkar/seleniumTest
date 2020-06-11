import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tutorial8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        String filePath = "C:\\Users\\Vaibhav\\Downloads\\bgapte.jpg";
        WebElement txtFileUpload = driver.findElement(By.id("uploadfile_0"));
        txtFileUpload.sendKeys(filePath);

        WebElement checkBoxTerms = driver.findElement(By.id("terms"));
        checkBoxTerms.click();

        WebElement btnSubmit = driver.findElement(By.id("submitbutton"));
        btnSubmit.click();

        WebElement txtResultText = driver.findElement(By.id("res"));
        String msgResultText = txtResultText.getText();
        System.out.println(msgResultText);

        driver.close();
    }
}
