package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getWindowHandle());
        // CDwindow-5C2B10B70816256CA9163939C20A83E0
        // CDwindow-7FD8E7EEAFA536C9175B0125C81BB290
        // getWindowHandle selenium tarafindan her driver sayfasi icin uretilen
        // unique handle degerini döndürür
        // getWindowHandels()ise test sirasinda birden fazla sayfa acilmissa
        // bir set olarak, tum sayfalarin window handle degerlerini döndürür

        System.out.println(driver.getPageSource());

        // sayfa kodlari "2 hours weekly meeting with the team" içeriyor mu test edin

        String expectedIcerik = "2 hours weekly meeting with the team";
        String actualSayfaKodlari = driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        driver.quit();
        // close() ve guit() ikisi de sayfa kapatmak için kullanilir
        // close() sadece bir sayfa kapatirken
        // guit() test sirasinda açilan tüm sayfalari kapatir
    }
}
