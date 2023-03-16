package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasınıa gidin
        driver.get("https://www.amazon.com");


        // arama kutusunu locate edip bir webelenet olarak kaydedin
        // id'si twotabsearchtexbox olan webelement seklinde locate edecegiz

        /*
        driver'a webelement tarif etme islemine Locate
        bu tarifi yapabilmek için kullanabilecegim degiskenlere de LOCATOR denir

        8 tane Locator vardir;
        Lokator'larin 6 tanesi webelement'in ozelliklerine baglidir
           - id
           - calssname
           - name
           - tagname
           - linkText
           - partialLinkText
        Geriye kalan 2 lacator ise her türlü webelement locate etmek için kullanilabilir
        - xpath
        - cssSelector
         */

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));


        // arama kutusuna "Nutella" yazıp aratin

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Thread.sleep(3000);
        driver.close();



    }
}
