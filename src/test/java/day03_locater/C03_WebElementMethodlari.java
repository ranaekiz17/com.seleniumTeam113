package day03_locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidip arama kutusunu locate edelim

        driver.get("https://www.amazon.com");
        WebElement aramaKutusuElement =driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(aramaKutusuElement.isDisplayed()); // true
        System.out.println(aramaKutusuElement.isEnabled()); // true

        System.out.println(aramaKutusuElement.getText()); // varsa web element uzerindeki yaziyi getirir

        aramaKutusuElement.sendKeys("Nutella");
        Thread.sleep(2000);
        aramaKutusuElement.clear();

        System.out.println(aramaKutusuElement.getSize()); //(789, 38)
        System.out.println(aramaKutusuElement.getSize().height); // 38

        System.out.println(aramaKutusuElement.getTagName()); // input
        System.out.println(aramaKutusuElement.getAttribute("class")); //nav-input nav-progressive-attribute

        System.out.println(aramaKutusuElement.getLocation()); //(279, 10)

        System.out.println(aramaKutusuElement.getRect().getDimension()); //(789, 38)


        Thread.sleep(300);
        driver.close();
    }
}
