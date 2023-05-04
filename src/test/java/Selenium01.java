import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Selenium01 {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.automationexercise.com/");

        List<WebElement> markaElementlist = driver.findElements(By.className("brands_product"));



        WebElement productElementi = driver.findElement(By.partialLinkText("Products"));
        productElementi.click();
        WebElement aramaKutusuElementi = driver.findElement(By.id("search_product"));
        aramaKutusuElementi.sendKeys("TSHIRT");
        aramaKutusuElementi.click();
        WebElement butonElementi = driver.findElement(By.id("submit_search"));
        butonElementi.click();

        // WebElement cartElementi = driver.findElement(By.className("choose"));
        //cartElementi.click();




        Thread.sleep(3000);
        driver.close();

    }
}