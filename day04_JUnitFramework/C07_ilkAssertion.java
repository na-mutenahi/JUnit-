package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_ilkAssertion {

    //1) Bir class oluşturun: BestBuyAssertions
    //2) https://www.bestbuy.com/ Adresine gidin
    //   farkli test method’lari olusturarak asagidaki testleri yapin
    //      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com");
    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void test01(){
        //      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin

        String expectedUrl="https://www.bestbuy.com/";
        String actuelUrl= driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actuelUrl);
    }

    @Test
    public void Test02(){
        //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

        String expectedIcerik="Rest";
        String actuelTitile=driver.getTitle();

        Assert.assertFalse(actuelTitile.contains(expectedIcerik));
    }

    @Test
    public void Test03(){
        //      ○ logoTest => BestBuy logosunun görüntülendigini test edin

        WebElement logoElementi=driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());
    }

    @Test
    public void Test04(){
        //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        WebElement  fransizcaLinki=driver.findElement(By.xpath("//button[text()='Français']"));
        Assert.assertTrue(fransizcaLinki.isDisplayed());

    }
}
