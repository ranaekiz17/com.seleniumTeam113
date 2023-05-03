package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        // sisteme webdriver'in ne olacagini ve bu driver'in hangi dosya yolunda oldugunu soyler.

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com"); // istenen url'e bizi goturur
        // www yazmasak da calisir ancak https yazmazsak calismaz

        System.out.println(driver.getTitle()); // bize title'i dondurur.

        System.out.println(driver.getCurrentUrl()); //

        System.out.println(driver.getPageSource());
        // gidilen web sayfasinin kaynak kodlarini dondurur.

        System.out.println(driver.getWindowHandle());  // 370D1303031BD4CF3AB4EFE33A4E2DC1
        // acilan her bir pencereye verilen unique hash code degeridir

        System.out.println(driver.getWindowHandles()); //[370D1303031BD4CF3AB4EFE33A4E2DC1]
        // eger driver calısırken birden fazla pencere veya tab olusturduysa
        // acilan tum windows/tablar'in unique hash code larini bir set olarak dondurur

        Thread.sleep (5000); // mili saniye olarak yazdigimiz sayi suresince kodu bekletir
        driver.close(); // acilan browser'i kapatir





    }
}
