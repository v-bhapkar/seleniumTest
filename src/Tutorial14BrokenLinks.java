/*      For checking the broken links, you will need to do the following steps.
        Collect all the links in the web page based on <a> tag.
        Send HTTP request for the link and read HTTP response code.
        Find out whether the link is valid or broken based on HTTP response code.
        Repeat this for all the links captured.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static sun.plugin.javascript.navig.JSType.URL;

public class Tutorial14BrokenLinks {

    public static void main(String[] args) {

        String homePage = "http://www.pureecosoft.com/";
        String url = "";
        HttpURLConnection huc = null;
        int responseCode =200;

        System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(homePage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        Iterator<WebElement> it = linkList.iterator();

        while(it.hasNext()){
            url = it.next().getAttribute("href");
            System.out.println(url);
            if(url==null || url.isEmpty()){
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            if(!url.startsWith("http://www.pureecosoft.com/")){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
        }

        try{
            huc = (HttpURLConnection)(new URL(url).openConnection());
            huc.setRequestMethod("HEAD");
            huc.connect();
            int respCode = huc.getResponseCode();
            if(respCode >= 400){
                System.out.println(url+" is a broken link");
            }
            else{
                System.out.println(url+" is a valid link");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }


}
