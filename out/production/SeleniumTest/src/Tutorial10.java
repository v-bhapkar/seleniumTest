import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tutorial10 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // X path different way

        // Simple X path
        // Relative xpath: //*[@class='featured-box']//*[text()='Testing']

        WebElement element1 = driver.findElement(By.xpath("//*[@title='Machine Learning']"));
        System.out.println(element1.isDisplayed());
        WebElement element2 = driver.findElement(By.xpath("//*[@class='featured-box cloumnsize1']//*[text()='Testing']"));
        System.out.println(element2.isDisplayed());

        //Sample x path examples

        /*WebElement element3 = driver.findElement(By.xpath("//input[@type='text']"));
        if (element3.isDisplayed()) {
            System.out.println("Element is displayed");

        }else{
            System.out.println("Element is not display");
        }
        WebElement element4 = driver.findElement(By.xpath("//label[@id='message23']"));
        if (element4.isDisplayed()) {
            System.out.println("Element is displayed");

        }else{
            System.out.println("Element is not display");
        }
        WebElement element5 = driver.findElement(By.xpath("//input[@value='RESET']"));
        if (element5.isDisplayed()) {
            System.out.println("Element is displayed");

        }else{
            System.out.println("Element is not display");
        }
        WebElement element6 = driver.findElement(By.xpath("Xpath =//*[@class='barone']"));
        if (element6.isDisplayed()) {
            System.out.println("Element is displayed");

        }else{
            System.out.println("Element is not display");
        }*/
        WebElement element7 = driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/']"));
        if (element7.isDisplayed()) {
            System.out.println("Element is displayed");

        }else{
            System.out.println("Element is not display");
        }
        WebElement element8 = driver.findElement(By.xpath("//img[@src='//cdn.guru99.com/images/home/java.png']"));
        if (element8.isDisplayed()) {
            System.out.println("Element is displayed");

        }else{
            System.out.println("Element is not display");
        }
        // X path with Contains

    driver.close();

    }
}
