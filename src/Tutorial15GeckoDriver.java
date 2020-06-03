import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Tutorial15GeckoDriver {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Vaibhav\\Downloads\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        WebDriver driver= new FirefoxDriver();

        driver.get("http://demo.guru99.com/selenium/guru99home/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

    }
}
