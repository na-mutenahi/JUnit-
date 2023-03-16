package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CooklesGecme {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");

        // eger cookies ekrani çıkarsa--->cookies'i kabul ederek cookiese kranını kapatın

        //driver.findElement(By.xpath("//div[text()='Accsept all']")).click();


        // arama cubuguna Java yazip aratın
        WebElement aramaCubugu = driver.findElement(By.xpath("//input[@name='q']"));

        aramaCubugu.sendKeys("Java" + Keys.ENTER);


        // bulunan sonuc sayisinin 100 binden oldugunu test edin
        WebElement sonucSayiElementi= driver.findElement(By.xpath("//div[@id='result-stats']"));

        //System.out.println(sonucSayiElementi.getText());// About 1.720.000.000 sonuç bulundu (0,32 saniye)
        String sonucYazisi= sonucSayiElementi.getText();
        String[] sonucYaziArr= sonucYazisi.split(" ");

        String sonucSayisiStr= sonucYaziArr[1];// 1.720.000.000
        sonucSayisiStr= sonucSayisiStr.replaceAll("\\D","");

        int actualSonucSayisi= Integer.parseInt(sonucSayisiStr);
        int expectedSonucSayisi= 100000;

        if (actualSonucSayisi>expectedSonucSayisi){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else {
            System.out.println("Arama sonuc sayisi testi FAILED");
        }

        driver.close();


    }
}
