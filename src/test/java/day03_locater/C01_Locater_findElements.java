package day03_locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locater_findElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // arama kutusuna Nutella yazdirip
        /*

             Test otomasyonu yaparken bir web elementi kullanmak istersek
             iki seye ihtiyacimiz var
             1-o web elementi benzersiz olarak tarif edebilecegimiz bir locater
             2- bu locater'i soyledigimizde bize web elementi bulup getirecek method


             ornegin amazon sitesindeki arama kutusunun unique tarif edicisi olarak
             id = "twotabsearchtextbox" kullanabiliriz
         */

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
        //dataturu  objenin adi   assignment  find Element : web elementi bulan method
        //                                     By : web elementi bulacagimiz locater'in turunu yazdıgımız method
        //                                     twotabsearhtextbox: unique tarif icin id attribute degeri

        /*
           findElement() verdigimiz locator turu ve o locator icin verdigimiz degere gore
           webelement'i arar
           locator icin verdigimiz deger hataliysa
           locator stratejisinde hata yaptiysak
           aranan web elementi implicitlyWait olarak tanimladigimiz
           maximum sure boyunca  arar
           bulamadıgımız icin "NoSuchElementException" verir
         */


        aramaKutusuElementi.sendKeys("Nutella");
        //// istenen webelement'e istenen yaziyi gonderir


        // enter tusuna basrak arama yapin
        aramaKutusuElementi.submit();
        // istenen web elementi uzerinde enter tusuna basar


        Thread.sleep(3000);
        driver.close();
    }




}
