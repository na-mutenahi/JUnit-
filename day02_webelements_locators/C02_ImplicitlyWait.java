package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class C02_ImplicitlyWait {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_mac_arm64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        driver'i bir web uygulamasina gönderdiğimizde
        o sayfanin acilmasi
        orada istediğimiz islemleri yapmak için elementleri bulmasi... gibi islemler
        zaman gerektirebilir

        implicitlyWait bu tur zaman isteyen islemler için
        driver'in max. ne kadar bekleyecegini belirler
         */

    }
}
