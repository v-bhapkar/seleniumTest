

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tutorial3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        List<WebElement> listRadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
        List<WebElement> listCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println("Radio Button options");
        for (int i = 0; i <listRadioButton.size() ; i++) {
            System.out.println(listRadioButton.get(i).getAttribute("value"));

        }
        System.out.println("Check box options");
        for (int i = 0; i <listCheckBox.size() ; i++) {
            System.out.println(listCheckBox.get(i).getAttribute("value"));

         // Select Radio option 2 and checkbox option 3 in the current scenario
       
         listRadioButton.get(1).click();
         listCheckBox.get(2).click();

        }
    }
}
