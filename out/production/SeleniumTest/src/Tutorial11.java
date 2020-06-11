import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Tutorial11 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      /*  driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement customerID = driver.findElement(By.name("cusid"));
        WebElement btnSubmit = driver.findElement(By.name("submit"));

        customerID.sendKeys("1");
        btnSubmit.click();
        Alert alert = driver.switchTo().alert();
        if (alert.getText().equalsIgnoreCase("Do you really want to delete this Customer?")) {
            System.out.println(alert.getText());
            alert.accept();
            if (alert.getText().equalsIgnoreCase("Customer Successfully Delete!")) {
                System.out.println(alert.getText());
                alert.accept();
                driver.close();
            }
        }
        driver.close();*/

        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);

        WebElement linkClickHere = driver.findElement(By.xpath("//*[text()='Click Here']"));
        linkClickHere.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while(i1.hasNext()) {
            String childWindow = i1.next();
            if (!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                driver.findElement(By.name("emailid")).sendKeys("vaibhavbhapkar@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                driver.close();
            }

        }
        //Switch to the main window
        driver.switchTo().window(mainWindow);
        driver.close();
    }

}
