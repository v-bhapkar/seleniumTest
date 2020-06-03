import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tutorial1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      //  driver.get("http://demo.guru99.com/test/ajax.html");
        driver.get("https://www.timeanddate.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);


 /*       List<WebElement> listRadioButton = driver.findElements(By.name("name"));
        int count = listRadioButton.size();
        for (int i = 0; i <count ; i++) {

            System.out.println( "Option " + (i+1) +":==" +listRadioButton.get(i).getAttribute("value"));

        }

        WebElement radioYes = driver.findElement(By.id("yes"));
        WebElement btnCheck = driver.findElement(By.id("buttoncheck"));
        WebElement txtMessage = driver.findElement(By.className("radiobutton"));
        String strYesMessage = "Radio button is checked and it's value is Yes";
        radioYes.click();
        btnCheck.click();
        String strActualMessage = txtMessage.getText();
        if (strActualMessage.contentEquals(strYesMessage)) {

            System.out.println("Option Yes is selected");
            driver.close();*/

        List<WebElement> listOfCountry = driver.findElements(By.xpath("//select[@id='country']"));
        for (int i = 0; i <listOfCountry.size() ; i++) {
            System.out.println(listOfCountry.get(i).getAttribute("option"));

        }

        }
    }


