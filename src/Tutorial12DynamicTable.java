import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tutorial12DynamicTable {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        // Find number of rows and column from the dunamic webtable

        List<WebElement> tableColumnCount = driver.findElements(By.xpath("*//table[@class='dataTable']/thead/tr/th"));
        System.out.println("Total table column numbers  = "+ tableColumnCount.size());

        List<WebElement> tableRowCount = driver.findElements(By.xpath("*//table[@class='dataTable']/tbody/tr/td"));
        System.out.println("Total table row count = "+tableRowCount.size());

        // Fetch cell value of a particular row and column of the Dynamic Table

        WebElement webTableTopGainers = driver.findElement(By.xpath("*//table[@class='dataTable']"));

        WebElement tableColumn = webTableTopGainers.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[4]"));
        WebElement tableRow = webTableTopGainers.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]"));

        System.out.println("WebTable Coulmn Value = "+ tableColumn.getText());
        System.out.println("WebTable Row values = " + tableRow.getText());

        // Retrive following value from web table
        // 1. Company Name = Welspun Corp
        // 2. Coulmn value = 	% Change

        //Find Row number of Companey
        int companyRowNumber=0;
        int tCount = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
        String companyName;
        for(int i = 1; i < tCount;i++){
            companyName = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
            System.out.println(companyName);
            if(companyName.equalsIgnoreCase("Bharat Petroleum")){
                companyRowNumber = i;

            }
        }
        System.out.println(companyRowNumber);
        driver.close();
    }
}
