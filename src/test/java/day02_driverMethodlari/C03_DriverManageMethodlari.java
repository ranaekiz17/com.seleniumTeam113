package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        /*
        Selenium 4.7 versiyonu ile kendi driver'ini sisteme ekledi
        Kodlar calismaya basladigında biz driver icin yol gostermezsek
        Selenium kendi driver'ini devreye sokuyor.
        Ama baslangicta driver ayari  aradigi icin biraz yavas caisiyor

        //
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        /*
         implicitlyWait bir websayfasi acilincaya kadar
         driver'in bekleyecegi maximum sureyi belirler
         */

        driver.get("http://www.amazon.com");

        System.out.println("Baslangıcta konum" +driver.manage().window().getPosition()); //Baslangıcta konum(9, 9)
        System.out.println("Baslangıcta boyut" +driver.manage().window().getSize()); //Baslangıcta boyut(1051, 798)

        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println("Maximize konum" +driver.manage().window().getPosition()); //Maximize konum(-8, -8)
        System.out.println("Maximize boyut" +driver.manage().window().getSize()); //Maximize boyut(1552, 832)

        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum" +driver.manage().window().getPosition()); //Fullscreen konum(0, 0)
        System.out.println("Fullscreen boyut" +driver.manage().window().getSize()); //Fullscreen boyut(1536, 864)

        Thread.sleep(1000);
        driver.manage().window().minimize();
        System.out.println("Minimaze konum" +driver.manage().window().getPosition()); //Minimaze konum(9, 9)
        System.out.println("Minimaze boyut" +driver.manage().window().getSize()); //Minimaze boyut(1051, 798)


        // pencereyi istedigimiz boyut
        Thread.sleep(1000);
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println("Istedigimiz konum" +driver.manage().window().getPosition()); //Istedigimiz konum(48, 48)
        System.out.println("Istedigimiz boyut" +driver.manage().window().getSize()); //Istedigimiz boyut(516, 502)



        Thread.sleep(3000);
        driver.close();
    }
}
